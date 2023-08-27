package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	


	public static WebDriver driver;

//browserlaunch

	public static void browserLaunch(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	//Maximize
	public static void maximize() {
		driver.manage().window().maximize();
		
	}

	public static void sendValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}
	
	public void dropDown(WebElement Text,String Txt) {
		Select s=new Select(Text);
				s.selectByVisibleText(Txt);
	}

	public void gettingText(WebElement ref) {
		String value = ref.getText();
		System.out.println(value);
					
				}
	
	
	//print url
	public static void printurl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	//print title
	public static void printtitle() {
		System.out.println(driver.getTitle());
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}
	

	



