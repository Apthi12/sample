package com.hcl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 mobile");
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.xpath("//*[text()='Apple iPhone 14 (128 GB) - Blue']" ));
		mobile.click();
		WebElement cart = driver.findElement(By.id("submit.Add-to-Cart"));
		cart.click();
		Thread.sleep(2000);
			
		
	}

}
