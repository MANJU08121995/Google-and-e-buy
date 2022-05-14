package com.testrunner;

import org.gmail.Ebay_Nani.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.properties.Configuration_Helper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com.stepdefinition", monochrome = true)
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void steUp() throws Throwable {
		String br = Configuration_Helper.getInstance().getInstanceCR().getbrowser();
		driver = BaseClass.browserLaunch(br);
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
