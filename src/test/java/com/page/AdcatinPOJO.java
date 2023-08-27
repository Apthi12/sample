package com.page;

import org.testng.annotations.Test;

import com.base.Base1;

public class AdcatinPOJO extends Base1{
	
	@Test
	public void Adcatintest() {
		
		browserLaunch("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		//Classes
		AdcatinLogin login = new AdcatinLogin();
		AdcatinSearchHotel search = new AdcatinSearchHotel();
		AdcatinSelectHotel select = new AdcatinSelectHotel();
		AdcatinBookHotel book = new AdcatinBookHotel();
		
		//login
		sendValue(login.getusername(), "abinesh12345");
		sendValue(login.getpassword(), "12345");
		login.getlogin().click();
		
		//search
		dropDown(search.getlocation(), "Paris");
		dropDown(search.gethotel(), "Hotel Creek");
		dropDown(search.getroom(), "Standard");
		dropDown(search.getroomnos(), "2-Two");
		dropDown(search.getadults(), "1-One");
		dropDown(search.getchild(), "0-None");
		gettingText(search.getsearch());
		search.getsearch().click();
		
		//select
		select.getRadioBtn().click();
		gettingText(select.getSelectHtl());
		select.getContinue().click();
		
		//Book
		sendValue(book.getFirstName(), "Supriya");
		sendValue(book.getLastName(), "Apthi");
		sendValue(book.getaddress(), "Bengaluru");
		sendValue(book.getCreditCardNumber(), "1234567890123456");
		sendValue(book.getCardType(),"VISA");
		sendValue(book.getMonth(), "April");
		sendValue(book.getYear(),"2028");
		sendValue(book.getCvvNum(),"654");
		gettingText(book.getText1());
		book.getText1().click();
		driver.quit();
		
		
		
		
		
		
	}

	}

		
	

	
	


