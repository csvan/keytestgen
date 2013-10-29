package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.RemoveSDPsTransformer;

public class RemoveSDPsTransformerTest extends TransformerTest {

    public RemoveSDPsTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer = RemoveSDPsTransformer.getInstance();
    }
}
