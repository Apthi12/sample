package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Besant Technologies");
		
		//getAttibute
		
		String textValue = username.getAttribute("value");
		System.out.println(textValue);
		
		
		// TODO Auto-generated method stub

	}

}
