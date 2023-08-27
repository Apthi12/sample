package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base1;

public class AdcatinBookHotel extends Base1 {
	

	public AdcatinBookHotel() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNumber;
	
	@FindBy(xpath="//label[text()='Use 16 digit Dummy Data']")
	private WebElement CreditCardNumberText;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement CreditCardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement ExpiryDateMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement ExpiryDateYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CvvNumber;
	
	@FindBy(xpath="//td[text()='Book A Hotel']")
	private WebElement BookHotel;
	
	public WebElement getFirstName() {
		return firstName;
	}
		
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getaddress() {
		return billingAddress;
	}
	
	public WebElement getCreditCardNumber() {
		return CreditCardNumber;
	}
	
	public WebElement getText() {
		return CreditCardNumberText;
	}
	
	public WebElement getCardType() {
		return CreditCardType;
	}
	
	public WebElement getMonth() {
		return ExpiryDateMonth;
	}
	
	public WebElement getYear() {
		return ExpiryDateYear;
	}
	
	public WebElement getCvvNum() {
		return CvvNumber;
	}
	
	public WebElement getText1() {
		return BookHotel;
	}
	
	
	}	
	


