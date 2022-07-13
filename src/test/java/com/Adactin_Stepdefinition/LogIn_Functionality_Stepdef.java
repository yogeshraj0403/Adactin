package com.Adactin_Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.Adactin.Base_Class;
import com.Adactin_Runner.Test_Runner;
import com.FileReaderManager.File_Reader_Manager;
import com.POM.POM_LogIn;
import com.POM.POM_Search_Hotel;
import com.Page_Object_Method.Page_Object_Method;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn_Functionality_Stepdef extends Base_Class {
	
	public static WebDriver driver = Test_Runner.driver;
	
	Page_Object_Method pom = new Page_Object_Method(driver);
	
	@Given("user launches the appplication")
	public void user_launches_the_appplication() throws IOException {
		getUrl(File_Reader_Manager.getInstanceFRM().getInstanceCR().getdb_url());
	    
	}
	@When("user enters the valid username")
	public void user_enters_the_valid_username() throws IOException {
		sendKeys(pom.getLogInPage().getUserName(),File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName());
	}
	@When("user enters the valid password")
	public void user_enters_the_valid_password() throws IOException {
		sendKeys(pom.getLogInPage().getPassword(),File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword());
		
	}
	@Then("user click the login button and user navigates to the search hotel page")
	public void user_click_the_login_button_and_user_navigates_to_the_search_hotel_page() {
		click(pom.getLogInPage().getLoginButton());
	}
	
	@When("user selects the location")
	public void user_selects_the_location() {
		select(pom.getHotel().getLocation(),"value","New York");
	    
	}
	@When("user selects the hotel from dropdown")
	public void user_selects_the_hotel_from_dropdown() {
	   select(pom.getHotel().getHotels(),"value","Hotel Sunshine");
	}
	@When("user selects the room type from dropdown")
	public void user_selects_the_room_type_from_dropdown() {
		 select(pom.getHotel().getRoom_type(),"value","Deluxe");
	}
	@When("user selects the number of rooms from dropdown")
	public void user_selects_the_number_of_rooms_from_dropdown() {
		select(pom.getHotel().getNumberOfRooms(),"value","1");
	}
	@When("user selects the checkIn date")
	public void user_selects_the_check_in_date() {
		sendKeys(pom.getHotel().getCheckInDate(),"06/07/2022");
	}
	@When("user selects the checkout date")
	public void user_selects_the_checkout_date() {
		sendKeys(pom.getHotel().getCheckOutDate(),"10/07/2022");
	}
	@When("user selects the adultsperroom from dropdown")
	public void user_selects_the_adultsperroom_from_dropdown() {
		 select(pom.getHotel().getAdultsPerRoom(),"value","2");
	}
	@When("user selects the childrenperroom from dropdown")
	public void user_selects_the_childrenperroom_from_dropdown() {
		select(pom.getHotel().getChildrenPerRoom(),"value","2");
	}
	@Then("user clicks the search button and navigates to the select hotel page")
	public void user_clicks_the_search_button_and_navigates_to_the_select_hotel_page() {
	   click(pom.getHotel().getSubmitBtn());
	}
	
	@When("user clicks the radio button")
	public void user_clicks_the_radio_button() {
	   click(pom.getSelectHotel().getClickbtn());
	}
	@Then("user clicks the continue button and navigates to the book hotel page")
	public void user_clicks_the_continue_button_and_navigates_to_the_book_hotel_page() {
	   click(pom.getSelectHotel().getContinuebtn());
	}
	
	
	
	@When("user enters the first name")
	public void user_enters_the_first_name() {
	    sendKeys(pom.getBook_Hotel().getFirstName(),"yogeshkumar");
	}
	@When("user enters the last name")
	public void user_enters_the_last_name() {
	    sendKeys(pom.getBook_Hotel().getLastName(),"Ethiraj");
	}
	@When("user enters the Billing Address")
	public void user_enters_the_billing_address() {
	   sendKeys(pom.getBook_Hotel().getAddress(),"80, Mettu Street, Ayanavaram, Chennai - 600023");
	}
	
	@When("user enters the credit card number")
	public void user_enters_the_credit_card_number() {
	    sendKeys(pom.getBook_Hotel().getCc_num(),"1234567890123456");
	}
	@When("user select the credit card type from the dropdown")
	public void user_select_the_credit_card_type_from_the_dropdown() {
	    select(pom.getBook_Hotel().getCc_type(),"value","AMEX");
	}
	@When("user select the credit card expiry month from the dropdown")
	public void user_select_the_credit_card_expiry_month_from_the_dropdown() {
		select(pom.getBook_Hotel().getCc_exp_month(),"value","11");
	}
	@When("user select the credit card expiry year from the dropdown")
	public void user_select_the_credit_card_expiry_year_from_the_dropdown() {
		select(pom.getBook_Hotel().getCc_exp_year(),"value","2022");
	}
	@When("user enter the CCV number")
	public void user_enter_the_ccv_number() {
		sendKeys(pom.getBook_Hotel().getCc_cvv(),"123");
	    
	}
	@Then("click the book now button and user navigates to the booking confirmation page")
	public void click_the_book_now_button_and_user_navigates_to_the_booking_confirmation_page() throws InterruptedException {
	   click(pom.getBook_Hotel().getBook_now());
	   Thread.sleep(6000);
	}
	
	@When("user clicks the My Itinerary")
	public void user_clicks_the_my_itinerary() {
		click(pom.getConfirmation().getMy_itinerary());
	    
	}
	@Then("user navigates to the Booked Itinerary")
	public void user_navigates_to_the_booked_itinerary() {
	   
	}
	
	@When("user click the logout")
	public void user_click_the_logout() {
	    click(pom.getConfirmation().getLogoutbtn());
	}
	@Then("user successfully logged out from the page.")
	public void user_successfully_logged_out_from_the_page() {
	    
	}

	
		
		
		
		
		
		
		
		
		
		
		
		
	}






