package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	WebElement dublclk = driver.findElement(By.xpath("/*[text()='Double-Click Me To See Alert']"));
	
	Actions a = new Actions(driver);
	
	
	a.doubleClick(dublclk).perform();
	Thread.sleep(2000);
	
}
}