package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base1;

public class AdcatinLogin extends Base1 {
	
	public AdcatinLogin() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	public WebElement getusername() {
		return userName;
	}
	
	public WebElement getpassword() {
		return password;
	}
	
	public WebElement getlogin() {
		return loginbtn;
	}
}
