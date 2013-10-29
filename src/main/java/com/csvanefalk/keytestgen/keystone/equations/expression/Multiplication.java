package com.csvanefalk.keytestgen.keystone.equations.expression;

import org.apache.commons.math3.fraction.Fraction;

import com.csvanefalk.keytestgen.keystone.equations.IExpression;

public class Multiplication extends AbstractBinaryExpression {

    public Multiplication(final IExpression leftOperand,
            final IExpression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Fraction evaluate() {
        return getLeftOperand().evaluate().multiply(
                getRightOperand().evaluate());
    }

    @Override
    public String toString() {

        return "(" + getLeftOperand().toString() + " * "
                + getRightOperand().toString() + ")";
    }
}
