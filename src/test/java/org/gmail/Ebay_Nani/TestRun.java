package org.gmail.Ebay_Nani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gmail.pom.SingleTon_Design_Pattern;
import com.properties.Configuration_Helper;

public class TestRun extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		String br = Configuration_Helper.getInstance().getInstanceCR().getbrowser();
		driver = browserLaunch(br);
		String url = Configuration_Helper.getInstance().getInstanceCR().geturl();
		url(url);
		SingleTon_Design_Pattern s = new SingleTon_Design_Pattern(driver);
		userInput(s.gmail().getEmail(), "nanisathish19971@gmail.com");
		click(s.gmail().getNext());
		Thread.sleep(3000);
		userInput(s.Password().getPass(), "nani181479");
		click(s.Password().getNext());
		String naviGate = Configuration_Helper.getInstance().getInstanceCR().naviGate();

		navigates(naviGate);
		userInput(s.Ebay_page().getText(), "electric guitar");
		click(s.Ebay_page().getSubmit());
		Thread.sleep(2000);
		getText(s.Price_page().getPrice());
	}

}
