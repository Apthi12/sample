package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()='Create new account']")).click();

		WebElement day = driver.findElement(By.id("Day"));

		Select s = new Select(day);
		s.selectByValue("23");

		WebElement month = driver.findElement(By.id("Month"));

		Select s1 = new Select(month);
		s1.selectByIndex(5);

		WebElement year = driver.findElement(By.id("Year"));

		Select s2 = new Select(year);
		s2.selectByVisibleText("1994");
		driver.quit();

	}
}