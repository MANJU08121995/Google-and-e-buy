package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTon_Design_Pattern {
	public static WebDriver driver;

	public SingleTon_Design_Pattern(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver = driver2;
	}

	public Gmail gmail() {
		Gmail g = new Gmail(driver);
		return g;
	}

	public Password Password() {
		Password p = new Password(driver);
		return p;
	}
	public  Ebay_page Ebay_page() {
		Ebay_page ep=new Ebay_page(driver);
		return ep;
	}
	public  Price_page Price_page() {
		Price_page pp=new  Price_page(driver);
		return pp;

	}
}
