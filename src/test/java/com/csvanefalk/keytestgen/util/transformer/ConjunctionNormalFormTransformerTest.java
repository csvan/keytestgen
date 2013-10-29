package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.ConjunctionNormalFormTransformer;
import com.csvanefalk.keytestgen.util.transformers.NegationNormalFormTransformer;

public class ConjunctionNormalFormTransformerTest extends TransformerTest {

    public ConjunctionNormalFormTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer = ConjunctionNormalFormTransformer.getInstance();
    }
}
