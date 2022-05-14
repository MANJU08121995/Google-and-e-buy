package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_page {
	public static WebDriver driver;
	public Ebay_page(WebDriver driver2) {
		PageFactory.initElements(driver2,this);
		this.driver=driver2;
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Ebay_page.driver = driver;
	}
	public WebElement getText() {
		return text;
	}
	public void setText(WebElement text) {
		this.text = text;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement text;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	

}
