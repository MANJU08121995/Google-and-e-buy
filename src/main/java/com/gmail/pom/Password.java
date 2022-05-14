package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password {
public static WebDriver driver;
@FindBy(xpath="//input[@type='password']")
private WebElement pass;
public Password(WebDriver driver2) {
	PageFactory.initElements(driver2, this);
	this.driver=driver2;
}
public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	Password.driver = driver;
}
public WebElement getPass() {
	return pass;
}
public void setPass(WebElement pass) {
	this.pass = pass;
}
public WebElement getNext() {
	return next;
}
public void setNext(WebElement next) {
	this.next = next;
}
@FindBy(xpath="//span[text()='Next']")
private WebElement next;

}
