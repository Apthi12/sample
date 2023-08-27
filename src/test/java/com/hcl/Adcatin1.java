package com.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;



	public class Adcatin1  {
	
	public static WebDriver driver1;
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("abinesh12345");
	driver.findElement(By.id("password")).sendKeys("12345");
	driver.findElement(By.id("login")).click();
	WebElement text = driver1.findElement(By.xpath("//*[text()='Search Hotel')"));
	String text1 = text.getText();
	System.out.println(text1);
	WebElement loc = driver1.findElement(By.id("Location"));
	Select s = new Select(loc);
	s.selectByVisibleText("Sydney");
	WebElement hot = driver1.findElement(By.id("Hotels"));
	Select s1 = new Select(hot);
	s1.selectByVisibleText("Hotel Creek");
	WebElement rmtyp = driver1.findElement(By.id("Room Type"));
	Select s2 = new Select(rmtyp);
	s2.selectByVisibleText("Standard");
	WebElement Norm = driver1.findElement(By.id("Number of Rooms"));
	Select s3 = new Select(Norm);
	s3.selectByVisibleText("2 - Two");
	WebElement Adults = driver1.findElement(By.id("Adults per Room"));
	Select s4 = new Select(Adults);
	s4.selectByVisibleText("1 - One");
	WebElement Children = driver1.findElement(By.id("Children per Room"));
	Select s5 = new Select(Children);
	s5.selectByVisibleText("0 - None");
	driver.findElement(By.id("Submit")).click();
	WebElement text2 = driver1.findElement(By.xpath("//*[text()='Select Hotel']"));
	String text3 = text2.getText();
	System.out.println(text3);
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("Continue")).click();
	driver.findElement(By.id("firstname")).sendKeys("Supriya");
	driver.findElement(By.id("lastname")).sendKeys("Apthi");
	driver.findElement(By.id("billingaddress")).sendKeys("Venkateshwara Nilaya 11th Cross Akshaya Nagar, Bengaluru - 560016");
	driver.findElement(By.id("Creditcard")).sendKeys("987654321123456");
	WebElement text4 = driver1.findElement(By.xpath("//*[text()='Use 16 digit Dummy Data')"));
	String text5 = text4.getText();
	System.out.println(text5);
	WebElement credittype = driver1.findElement(By.id("Credit Card Type"));
	Select s6 = new Select(credittype);
	s6.selectByVisibleText("American Express");
	WebElement expmnt = driver1.findElement(By.id("Expiry Month"));
	Select s7 = new Select(expmnt);
	s7.selectByVisibleText("June");
	WebElement expyr = driver1.findElement(By.id("Expiry Year"));
	Select s8 = new Select(expyr);
	s8.selectByVisibleText("2025");
	driver.findElement(By.id("cvvnmbr")).sendKeys("654");
	driver.findElement(By.id("book now")).click();
	driver.quit();
			
		}
	}



