package com.csvanefalk.keytestgen.targetmodels.operationalcontracts;

public class UseOperationContractQueryTest {
	public static int main(int value) {
		return magicTransformation(value);
	}
	
	/*@
	  @ ensures \result == value * 2;
	  @*/
	public static int magicTransformation(int value) {
		throw new RuntimeException(); 
	}
	
	public static int magicNumber() {
		return 39 + 3;
	}
}
