package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdcatinHotel {

	public static WebDriver driver = new ChromeDriver();

//browserlaunch

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	public void sendValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}
	

	
	
	public static void dropdown(WebElement ref) {
		Select s = new Select(ref);
		s.selectByIndex(4);
	}
	public static void buttonclick(WebElement ref) {
		ref.click();
	
}

}