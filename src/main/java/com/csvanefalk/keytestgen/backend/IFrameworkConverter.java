package com.csvanefalk.keytestgen.backend;

import com.csvanefalk.keytestgen.core.testsuiteabstraction.TestSuite;

/**
 * Implementers of this interface are used in order to convert from the abstract
 * test suites generated by KeYTestGen2 to other formats.
 *
 * @author christopher
 */
public interface IFrameworkConverter {

    public ITestSuite convert(TestSuite testSuite) throws FrameworkConverterException;
}
