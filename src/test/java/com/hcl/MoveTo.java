package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveTo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement sell = driver.findElement(By.xpath("//[text()='Sell']"));
		
		
		
	//Actions - Class
		
		Actions a = new Actions(driver);
		
		//1. moveToElement()
		
		a.moveToElement(sell).perform();
		
		//right click
		a.contextClick().perform();
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
