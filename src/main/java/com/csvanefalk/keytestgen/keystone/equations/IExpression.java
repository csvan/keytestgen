package com.csvanefalk.keytestgen.keystone.equations;

import org.apache.commons.math3.fraction.Fraction;

import com.csvanefalk.keytestgen.keystone.equations.expression.ITreeNode;

public interface IExpression extends ITreeNode {

    Fraction evaluate();
}
