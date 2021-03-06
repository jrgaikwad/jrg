package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Parameters {
  WebDriver driver;
 
  
  
  @Test
  public void titleprint() {
	  System.out.println("Hi");
	  System.out.println(driver.getTitle());
  }
  
  @Parameters({"Browser", "URL"})
  @BeforeTest
  public void checkbrowser(String brwsr, String url) {
	  if (brwsr.equals("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "F:\\SW Testing\\Browser Drivers\\chromedriver.exe");
		  System.out.println("Entered in Chrome");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize(); 
		  driver.get(url);
	  }
	  else if (brwsr.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "F:\\SW Testing\\Browser Drivers\\geckodriver.exe");
		  System.out.println("Entered in FireFox");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	  }
  }
  @AfterTest
  public void aftermthd() {
	  driver.close();
  }
}
