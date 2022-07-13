package com.Page_Object_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.POM.POM_Book_Hotel;
import com.POM.POM_Booking_Confirmation;
import com.POM.POM_LogIn;
import com.POM.POM_Search_Hotel;
import com.POM.POM_SelectHotel;

public class Page_Object_Method {
	
	public static WebDriver driver;
	
	public Page_Object_Method(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public POM_LogIn getLogInPage() {
		POM_LogIn li = new POM_LogIn(driver);
		return li;
	}
	
	public POM_Search_Hotel getHotel() {
		POM_Search_Hotel sh = new POM_Search_Hotel(driver);
		return sh;
	}
	
	public POM_SelectHotel getSelectHotel() {
		POM_SelectHotel sh2 = new POM_SelectHotel(driver);
		return sh2;
	}
	
	public POM_Book_Hotel getBook_Hotel() {
		POM_Book_Hotel bh = new POM_Book_Hotel(driver);
		return bh;
	}
	
	public POM_Booking_Confirmation getConfirmation() {
		POM_Booking_Confirmation bc = new POM_Booking_Confirmation(driver);
		return bc;
	}
	
	
	
	
	

}
