package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.RemoveObserverFunctionsTransformer;

public class RemoveObserverFunctionsTransformerTest extends TransformerTest {

    public RemoveObserverFunctionsTransformerTest()
            throws KeYInterfaceException, IOException {
        transformer = RemoveObserverFunctionsTransformer.getInstance();
    }
}
