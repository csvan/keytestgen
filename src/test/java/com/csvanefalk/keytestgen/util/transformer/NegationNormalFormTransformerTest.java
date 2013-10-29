package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.NegationNormalFormTransformer;
import com.csvanefalk.keytestgen.util.transformers.TermTransformerException;
import de.uka.ilkd.key.logic.Term;
import de.uka.ilkd.key.logic.TermFactory;
import de.uka.ilkd.key.logic.op.Junctor;
import de.uka.ilkd.key.proof.init.ProofInputException;
import de.uka.ilkd.key.symbolic_execution.model.IExecutionNode;

public class NegationNormalFormTransformerTest extends TransformerTest {

    public NegationNormalFormTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer = NegationNormalFormTransformer.getInstance();
    }
}
