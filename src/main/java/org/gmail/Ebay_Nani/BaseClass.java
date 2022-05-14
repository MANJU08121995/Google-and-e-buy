package org.gmail.Ebay_Nani;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver = null;

	// 1Browser launch
	public static WebDriver browserLaunch(String options) {
		if (options.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (options.equalsIgnoreCase("edge"))

		{
			System.out.println("edge driver");
		} else {
			System.out.println("Invalid driver");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	// 2url
	public static void url(String url) {
		driver.get(url);
	}

	// 3sendKeys
	public static void userInput(WebElement ele, String s) {
		ele.sendKeys(s);
	}

	// 4Click
	public static void click(WebElement ele) {
		ele.click();
	}
	//5wait
	public static void waits(int a) throws InterruptedException {
		Thread.sleep(a);

	}
	public static void navigates(String value) {
		driver.navigate().to(value);
	}
	public static void getText(WebElement e) {
		String text = e.getText();
		System.out.println("The First Guitar Price : "+text);

	}
}
