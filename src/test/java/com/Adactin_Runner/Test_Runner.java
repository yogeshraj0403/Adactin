package com.Adactin_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)@CucumberOptions(features = "src\\test\\java\\com\\Adactin_Feature",glue = "com\\Adactin_Stepdefinition",
publish = true, monochrome = true, dryRun = false, plugin = {"html:target/cucumber/report.html","pretty","json:target/jsonreport.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Test_Runner {
public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		
		driver = Base_Class.getBrowser("Chrome");
	}
	
	@AfterClass
	public static void teardown() {
		driver.close();
	}
}

//monochrome helps to delete special characters in console
//dry run helps to find any errors in the snippets without opening the browser
// strict helps to find any errors in the snippets with opening the browser