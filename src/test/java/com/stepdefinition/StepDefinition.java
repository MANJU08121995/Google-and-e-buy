package com.stepdefinition;

import org.gmail.Ebay_Nani.BaseClass;
import org.openqa.selenium.WebDriver;

import com.gmail.pom.SingleTon_Design_Pattern;
import com.properties.Configuration_Helper;
import com.testrunner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;
	public static SingleTon_Design_Pattern s = new SingleTon_Design_Pattern(driver);

	@Given("user Launch The Url")
	public void user_launch_the_url() throws Throwable {
		String url = Configuration_Helper.getInstance().getInstanceCR().geturl();
		url(url);
	}

	@When("user EnterThe Valid Email In {string} Field")
	public void user_enter_the_valid_email_in_field(String email) {

		userInput(s.gmail().getEmail(), email);

	}

	@Then("user Click TheNext Button And Navigate To Password Page")
	public void user_click_the_next_button_and_navigate_to_password_page() throws InterruptedException {
		click(s.gmail().getNext());
		waits(3000);

	}

	@When("user EnterThe Valid Password In {string} Field")
	public void user_enter_the_valid_password_in_field(String password) throws InterruptedException {
		waits(3000);

		userInput(s.Password().getPass(), password);

	}

	@Then("user Click TheNext Button And Navigate To GoogleAccount Home Page")
	public void user_click_the_next_button_and_navigate_to_gmail_inbox_page() {
		click(s.Password().getNext());
	}

	@Given("user Navigate to The Ebay Url")
	public void user_navigate_to_the_ebay_url() throws Throwable {
		String naviGate = Configuration_Helper.getInstance().getInstanceCR().naviGate();
		navigates(naviGate);
	}

	@When("user Enter The {string} In Search Text Field")
	public void user_enter_the_in_search_text_field(String item) {
		userInput(s.Ebay_page().getText(), item );

	}

	@Then("user Click The Search Button And Navigate to Electric Guitar Page")
	public void user_click_the_search_button_and_navigate_to_electric_guitar_page() throws InterruptedException {
		click(s.Ebay_page().getSubmit());
waits(2000);		
	}
	@When("user Get The Guitar Price")
	public void user_get_the_guitar_price() {
		getText(s.Price_page().getPrice());

	}


}
