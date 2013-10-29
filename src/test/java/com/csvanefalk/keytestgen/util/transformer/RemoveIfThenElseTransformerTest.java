package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.RemoveIfThenElseTransformer;

public class RemoveIfThenElseTransformerTest extends TransformerTest {

    public RemoveIfThenElseTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer =RemoveIfThenElseTransformer.getInstance();
    }
}
