package RS_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
  @Test (groups= {"sanity"})
  public void login() {
	  System.out.println("Login Successful");
  }
  @Test (groups= {"sanity"})
  public void Homepage() {
	  System.out.println("Homepage");
	  Assert.assertFalse(true);
  }
}
