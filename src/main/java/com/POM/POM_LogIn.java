package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_LogIn {
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement userName;

	

	

	public POM_LogIn(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="login")
	private WebElement loginButton;



	public WebElement getLoginButton() {
		return loginButton;
	}
}
