package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	public Gmail(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver = driver2;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}

	@FindBy(xpath = "//span[.='Next']")
	private WebElement next;
}
