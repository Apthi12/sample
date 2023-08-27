package com.hcl;
import org.testng.annotations.Test;


public class Enabled {

	
	//to ignore the test case
@Test

 private void tc1() {
	
	System.out.println("tc1");
}


@Test(enabled = false)
private void tc2() {
	
	System.out.println("tc2");
	
}

@Test
private void tc3() {
	System.out.println("tc3");
}

}	
	