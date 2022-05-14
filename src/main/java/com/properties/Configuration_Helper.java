package com.properties;


public class Configuration_Helper {
	private Configuration_Helper() {
		
	}
	public static Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr=new Configuration_Reader();
		return cr;

	}
	public static Configuration_Helper getInstance() {
		Configuration_Helper ch=new Configuration_Helper();
		return ch;
	}

	}
		


