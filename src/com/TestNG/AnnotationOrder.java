package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationOrder {
  @Test (priority=0, timeOut=15000)
  public void testcase1() {
	  System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		
		dr.navigate().to("https://demo.guru99.com/test/newtours");
  }
  @Test (priority=1, invocationCount=3, enabled=false)
  public void testcase2() {
	  System.out.println("Test Case2: Verify balance tranfer with invalid input");
  }
  @Test (invocationCount=2)
  public void testcase3() {
	  System.out.println("Test Case3: Verify balance tranfer with null input");
  }
  @Test (priority=2)
  public void testcase4() {
	  System.out.println("Test Case4: Verify balance tranfer with wrong input");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test Case");  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Test Case");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Main Test:Saving acc module");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Main Test:Saving acc module");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
