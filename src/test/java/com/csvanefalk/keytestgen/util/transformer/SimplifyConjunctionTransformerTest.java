package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.SimplifyConjunctionTransformer;

public class SimplifyConjunctionTransformerTest extends TransformerTest {

    public SimplifyConjunctionTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer = SimplifyConjunctionTransformer.getInstance();
    }
}
