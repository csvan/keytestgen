package com.csvanefalk.keytestgen.keystone.equations.expression;

import org.apache.commons.math3.fraction.Fraction;

import com.csvanefalk.keytestgen.keystone.equations.IExpression;

public class Addition extends AbstractBinaryExpression {

    public Addition(final IExpression leftOperand,
            final IExpression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Fraction evaluate() {
        return getLeftOperand().evaluate().add(getRightOperand().evaluate());
    }

    @Override
    public String toString() {

        return "(" + getLeftOperand().toString() + " + "
                + getRightOperand().toString() + ")";
    }
}
