package com.hcl;

import org.testng.annotations.Test;

public class TestNGGroup {
	@Test(groups = {"smoke"})
	
	public void tc1()
	{ 
		System.out.println("smoke testing");
	}
    @Test(groups = {"sanity Testing"})
	
	public void tc2()
	{ 
		System.out.println("sanity testing");
	}
    
@Test(groups = {"UAT Testing"})
	
	public void tc3()
	{ 
		System.out.println("UAT testing");
	}

@Test(groups = {"Regression Testing"})

public void tc4()
{ 
	System.out.println("Regression testing");
}
}
    
    
