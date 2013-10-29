package com.csvanefalk.keytestgen.keystone.equations.comparator;

import javax.naming.OperationNotSupportedException;

import com.csvanefalk.keytestgen.keystone.equations.IExpression;

public class Equals extends AbstractComparator {

    public Equals(final IExpression leftOperand, final IExpression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public boolean evaluate() throws OperationNotSupportedException {
        return getLeftOperand().evaluate().equals(getRightOperand().evaluate());
    }

    @Override
    public String toString() {

        return getLeftOperand().toString() + " = "
                + getRightOperand().toString();
    }
}