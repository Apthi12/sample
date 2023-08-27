package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adcatin {
	
@Test

private void tc1() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.id("username"));
	user.sendKeys("abinesh12345");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("12345");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	
	WebElement txt = driver.findElement(By.className("login_title"));
	String text = txt.getText();
	System.out.println(text);
	
	WebElement loc = driver.findElement(By.id("location"));
	Select s1 = new Select(loc);
	s1.selectByVisibleText("Paris");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select s2 = new Select(hotel);
	s2.selectByVisibleText("Hotel Sunshine");
	
	WebElement rmtype = driver.findElement(By.id("room_type"));
	Select s3 = new Select(rmtype);
	s3.selectByVisibleText("Double");
	
	WebElement rooms = driver.findElement(By.id("room_nos"));
	Select s4 = new Select(rooms);
	s4.selectByValue("2");
	
	WebElement adults = driver.findElement(By.id("adult_room"));
	Select s5 = new Select(adults);
	s5.selectByIndex(1);
	
	WebElement chld = driver.findElement(By.id("child_room"));
	Select s6 = new Select(chld);
	s6.selectByIndex(2);
	
    driver.findElement(By.id("Submit")).click();
    
    //WebElement text2 = driver.findElement(By.xpath("//td[text()='Select Hotel']"));
    
  //  String textele = text2.getText();
   // System.out.println(textele);
    
    
   driver.findElement(By.id("radiobutton_0")).click();
   driver.findElement(By.id("continue")).click();
   driver.findElement(By.id("first_name")).sendKeys("Supriya");
	driver.findElement(By.id("last_name")).sendKeys("Apthi");
	driver.findElement(By.id("address")).sendKeys("Bengaluru");
	driver.findElement(By.id("cc_num")).sendKeys("9876543211234567");
	
	WebElement card = driver.findElement(By.id("cc_type"));
	Select s7 = new Select(card);
	s7.selectByIndex(3);
	
	WebElement exmonth = driver.findElement(By.id("cc_exp_month"));
	Select s8 =new Select(exmonth);
	s8.selectByIndex(8);
	
	WebElement expyr = driver.findElement(By.id("cc_exp_year"));
	Select s9 =new Select(expyr);
	s9.selectByVisibleText("2027");
	
	driver.findElement(By.id("cc_cvv")).sendKeys("654");
	driver.findElement(By.id("book_now")).click();
	String orderno = driver.findElement(By.xpath("//input[@id='order_no']")).getAttribute("value").toString();
	System.out.println("order no: "+orderno);
	}


}
