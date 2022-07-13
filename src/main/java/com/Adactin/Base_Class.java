package com.Adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Options;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\eyogesh\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\eyogesh\\eclipse-workspace\\Project_Class\\Drive\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		
		}
	
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void click(WebElement element ) {
		element.click();
	}
	
	public static void action(WebElement element, String option) {
		Actions a = new Actions(driver);
		if(option.equalsIgnoreCase("click")) {
			a.click().build().perform();
		}
		
		else if(option.equalsIgnoreCase("rightclick")) {
			a.contextClick().build().perform();
		}
		
		else if(option.equalsIgnoreCase("doubleclick")) {
			a.doubleClick().build().perform();
		}
		
		}
	
	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	public static void select(WebElement element, String option, String value) {
		Select s = new Select(element);
		if(option.equalsIgnoreCase("value")) {
		s.selectByValue(value);
		}
		
		else if(option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		
		else if(option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}
	}
	
	
		
	}

