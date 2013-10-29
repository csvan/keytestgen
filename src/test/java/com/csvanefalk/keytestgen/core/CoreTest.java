package com.csvanefalk.keytestgen.core;

import java.io.IOException;

import com.csvanefalk.keytestgen.KeYTestGenTest;
import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import testutils.TestEnvironment;

public class CoreTest extends KeYTestGenTest {

    private static TestEnvironment testEnvironment;

    public CoreTest() {
    }

    public CoreTest(String dir) throws KeYInterfaceException, IOException {
        super(dir);
    }
}
