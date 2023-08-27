package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	driver.manage().window().maximize();
	
	WebElement dragE = driver.findElement(By.xpath("/*[text()='Drag me']"));
	WebElement dropE = driver.findElement(By.xpath("/*[text()='Drop here']"));
	
	
	Actions a = new Actions(driver);
	
	a.dragAndDrop(dragE, dropE).perform();
	Thread.sleep(2000);
	

}
}