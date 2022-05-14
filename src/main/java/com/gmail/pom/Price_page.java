package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Price_page {
	public static WebDriver driver;
	public Price_page(WebDriver driver2) {
		PageFactory.initElements(driver2,this);
		this.driver=driver2;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getPrice() {
		return price;
	}
	@FindBy(xpath = "(//span[@class='s-item__price'])[2]")
	private WebElement price;
	

}
