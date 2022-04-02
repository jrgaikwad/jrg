package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test (groups="execute all")
public class dependsOn {

  @Test 
  public void homepage() {
    System.out.println("Home Page");
  }
  @Test (description= "Logged in")
  public void login() {
	  Assert.fail();
    System.out.println("Login");
  }
  @Test (dependsOnMethods="homepage")
  public void purchase() {
    System.out.println("Purchase");
  }
}
