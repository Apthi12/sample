package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {
	public static void main(String[] args){
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.id("username"));
	WebElement pass = driver.findElement(By.id("password"));
	WebElement loginBtn = driver.findElement(By.id("login"));
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	//send keys
	js.executeScript("arguments[0].setAttribute('value', 'abinesh12345')", user);
	
	//getAttribute
	Object userText = js.executeScript("return arguments[0].getAttribute('value')", user);
	System.out.println(userText);
	
	js.executeScript("arguments[0].setAttribute('value', '12345')", pass);
	
	//click
	js.executeScript("arguments[0].click()", loginBtn);

}
}
