package com.hcl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		//Navigate
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		
		
		//back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
	}

}
