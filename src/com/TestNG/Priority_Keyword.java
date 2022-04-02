package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Priority_Keyword {
  @Test
  public void testcase1() {
	  Assert.assertFalse(2<3, "fail");
	  System.out.println("Test Case1: Verify balance tranfer");
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
