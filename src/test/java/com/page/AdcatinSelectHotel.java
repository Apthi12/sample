package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base1;

public class AdcatinSelectHotel extends Base1 {
	
	public AdcatinSelectHotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selectRadioButton;
	
	@FindBy(xpath="//td[contains(text(),'Select Hotel')]")
	private WebElement SelectText;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBtn;
	
	public WebElement getRadioBtn() {
		return selectRadioButton;
	}
	
	public WebElement getSelectHtl() {
		return SelectText;
	}
	
	public WebElement getContinue() {
		return continueBtn;
		
	}
	
}
