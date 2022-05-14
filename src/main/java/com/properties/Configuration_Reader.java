package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\nani\\eclipse-workspace\\Ebay_Nani\\src\\main\\java\\com\\properties\\gmail.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public static String getbrowser() {
		String property = p.getProperty("browser");
		return property;

	}

	public static String geturl() {
		String url = p.getProperty("url");
		return url;

	}

	public static String naviGate() {
		String property = p.getProperty("navigateto");
		return property;
	}
}
