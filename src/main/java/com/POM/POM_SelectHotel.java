package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_SelectHotel {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement  clickbtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public POM_SelectHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getClickbtn() {
		return clickbtn;
	}

	

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	
	

}
