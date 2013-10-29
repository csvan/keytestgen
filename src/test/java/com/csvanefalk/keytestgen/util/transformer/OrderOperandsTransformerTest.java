package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.NegationNormalFormTransformer;
import com.csvanefalk.keytestgen.util.transformers.OrderOperandsTransformer;

public class OrderOperandsTransformerTest extends TransformerTest {

    public OrderOperandsTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer = OrderOperandsTransformer.getInstance();
    }
}
