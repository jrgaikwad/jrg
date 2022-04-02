package com.RS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		
		//Read Data
		FileInputStream fis = new FileInputStream ("F:\\Eclipse\\G1_Selenium\\src\\com\\RS\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		
		//Modify Data
		
		prop.setProperty("browser", "Edge");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream("F:\\Eclipse\\G1_Selenium\\src\\com\\RS\\data.properties");
		prop.store(fos, null);
	}

}
