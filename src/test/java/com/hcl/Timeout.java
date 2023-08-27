package com.hcl;

import org.testng.annotations.Test;

public class Timeout {

	// Timeout exception
	@Test

	private void tc1() {

		System.out.println("tc1");
	}

	@Test(timeOut = 10000)
	private void tc2() throws InterruptedException {
Thread.sleep(2000);
		System.out.println("tc2");

	}

	@Test
	private void tc3() {
		System.out.println("tc3");
	}

}
