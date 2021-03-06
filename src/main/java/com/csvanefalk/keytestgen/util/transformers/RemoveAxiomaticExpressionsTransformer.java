package com.csvanefalk.keytestgen.util.transformers;

import com.csvanefalk.keytestgen.StringConstants;
import com.csvanefalk.keytestgen.util.parsers.TermParserTools;
import de.uka.ilkd.key.logic.Term;

/**
 * This transformer simplifies a {@link Term} by removing from it expressions
 * which, in the context of Java, may be considered axiomatic. An example of
 * such a Term is the following (prettyprinted):
 * <p/>
 * <pre>
 * arr.length >= 0 -> arr[i] == 10
 *
 * (arr being an int[] instance, i being an integer)
 * </pre>
 * <p/>
 * While KeY does generate such expressions, it is evident that truth of the
 * sub-expression
 * <p/>
 * <pre>
 * arr.length &gt;= 0
 * </pre>
 * <p/>
 * is for all intents and purposes self-evident, since no Java array in a running
 * program may have a negative size. We can grant that the left side of the implication
 * is true, and thus replace the expression as a whole with simply
 * <p/>
 * <pre>
 * arr[i] == 10
 * </pre>
 * <p/>
 * TODO: This is really an elaborate hack, and it should be investigated if we
 * cannot simply make KeY simplify such expressions for us before they even make
 * it into KeYTestGen2.
 *
 * @author christopher
 */
public class RemoveAxiomaticExpressionsTransformer extends AbstractTermTransformer {

    private static RemoveAxiomaticExpressionsTransformer instance = null;

    public static RemoveAxiomaticExpressionsTransformer getInstance() {
        if (RemoveAxiomaticExpressionsTransformer.instance == null) {
            RemoveAxiomaticExpressionsTransformer.instance = new RemoveAxiomaticExpressionsTransformer();
        }
        return RemoveAxiomaticExpressionsTransformer.instance;
    }

    private RemoveAxiomaticExpressionsTransformer() {
    }

    /**
     * @param term term to check
     * @return true if the term represents an axiomatic statement, false otherwise.
     */
    private boolean isAxiomatic(Term term) {

        if (TermParserTools.isGreaterOrEquals(term)) {
            return isNonNegativeArrayLengthCheck(term);
        }

        return false;
    }

    /**
     * @param term term to check
     * @return true if the term repreesen a non-negative array-length check (i.e.
     * length(array) >= 0), or false otherwise.
     */
    private boolean isNonNegativeArrayLengthCheck(Term term) {

        Term leftChild = term.sub(0);
        Term rightChild = term.sub(1);

        if (isArrayLengthCheck(leftChild)) {
            if (TermParserTools.isInteger(rightChild)) {
                int rightChildValue = TermParserTools.getIntegerValue(term.sub(1));
                return rightChildValue == 0;
            }
        }
        return false;
    }

    /**
     * @param term term to check
     * @return true if the term represents an array-length check, false otherwise.
     */
    private boolean isArrayLengthCheck(Term term) {
        String opName = term.op().name().toString();
        return opName.equals(StringConstants.LENGTH);
    }

    @Override
    public Term transform(Term term) throws TermTransformerException {
        return transformTerm(term);
    }

    @Override
    protected Term transformImplication(Term term) throws TermTransformerException {

        Term firstChild = term.sub(0);
        if (isAxiomatic(firstChild)) {
            Term secondChild = term.sub(1);
            return secondChild;
        } else {
            return super.transformImplication(term);
        }
    }
}