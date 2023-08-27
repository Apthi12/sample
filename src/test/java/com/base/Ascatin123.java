package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ascatin123 {
	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("abinesh12345");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement text = driver.findElement(By.xpath("//*[text()='Search Hotel']"));
		String text1 = text.getText();
		System.out.println(text1);
		WebElement loc = driver.findElement(By.id("Location"));
		Select s = new Select(loc);
		s.selectByVisibleText("Paris");
	}
}

