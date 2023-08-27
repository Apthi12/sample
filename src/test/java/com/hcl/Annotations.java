package com.hcl;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	private void tc1() {
		System.out.println("tc1");
	}
		
		@BeforeClass
		private void beforeClass() {
			System.out.println("beforeClass");
		}
		
		@AfterMethod
		private void afterMethod() {
			System.out.println("afterMethod");
		}
			
			@AfterClass
			private void  afterClass() {
				System.out.println("afterClass");
				
			}
			
			@BeforeMethod
			private void beforeMethod() {
				System.out.println("beforeMethod");
			}
			
		
		}
		
		
	


