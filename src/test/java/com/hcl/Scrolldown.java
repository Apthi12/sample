package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {
	
	public static void main(String[] args){
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	WebElement bottom = driver.findElement(By.xpath("//*[contains(text(),'Back to top')]"));
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)", bottom);
}
}