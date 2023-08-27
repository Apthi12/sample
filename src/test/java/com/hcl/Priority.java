package com.hcl;

import org.testng.annotations.Test;


public class Priority {

	
	//default value of priority value is 0, so it will execute -1, 1, 2
@Test(priority= 2)

 private void tc1() {
	
	System.out.println("tc1");
}


@Test(priority= -1)
private void tc2() {
	
	System.out.println("tc2");
	
}

@Test(priority= 1)
private void tc3() {
	System.out.println("tc3");
}

}	
	


