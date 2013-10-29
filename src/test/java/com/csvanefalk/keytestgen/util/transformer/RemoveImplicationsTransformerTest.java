package com.csvanefalk.keytestgen.util.transformer;

import java.io.IOException;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.util.transformers.RemoveImplicationsTransformer;

public class RemoveImplicationsTransformerTest extends TransformerTest {

    public RemoveImplicationsTransformerTest() throws KeYInterfaceException,
            IOException {
        transformer = RemoveImplicationsTransformer.getInstance();
    }
}
