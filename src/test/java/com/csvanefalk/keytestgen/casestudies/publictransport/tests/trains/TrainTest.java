package com.csvanefalk.keytestgen.casestudies.publictransport.tests.trains;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.csvanefalk.keytestgen.core.keyinterface.KeYInterfaceException;
import com.csvanefalk.keytestgen.se.gu.svanefalk.testgeneration.KeYTestGenTest;
import com.csvanefalk.keytestgen.targetmodels.publictransport.trains.train.Train;

/**
 * Test case generation tests for the {@link Train} class.
 * 
 * @author christopher
 * 
 */
public class TrainTest extends KeYTestGenTest {

	public TrainTest() throws KeYInterfaceException, IOException {
		super("publictransport/trains");
	}

	@Test
	public void testStuff() {
		Assert.assertTrue(true);
	}
}
