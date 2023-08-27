package com.hcl;

import org.testng.annotations.Test;


public class InvocationCount {

	
	//to repeat the test case
@Test

 private void tc1() {
	
	System.out.println("tc1");
}


@Test
private void tc2() {
	
	System.out.println("tc2");
	
}

@Test(invocationCount = 5)
private void tc3() {
	System.out.println("tc3");
}

}

