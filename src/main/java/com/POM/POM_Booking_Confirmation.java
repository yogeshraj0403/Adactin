package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Booking_Confirmation {
	public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;
	
	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	@FindBy(id="logout")
	private WebElement logoutbtn;

	public POM_Booking_Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	

}
