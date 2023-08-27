package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base1;

public class AdcatinSearchHotel extends Base1 {
	public AdcatinSearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Search Hotel']")
	private WebElement text;
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="adults")
	private WebElement adultsroom;
	
	@FindBy(id="child")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement search;
	
	public WebElement getsearchhotel() {
		return text;
	}
	
	public WebElement getlocation() {
		return loc;
	}
	
	public WebElement gethotel() {
		return hotel;
	}
	
	public WebElement getroom() {
		return room;
	}
	
	public WebElement getroomnos() {
		return roomno;
	}
	
	public WebElement getadults() {
		return adultsroom;
	}
	
	public WebElement getchild() {
		return childroom;
	}
	
	public WebElement getsearch() {
		return search;
		
	}
	
	

}
