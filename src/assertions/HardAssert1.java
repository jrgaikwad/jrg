package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {
  @Test
  public void f() {
	  System.out.println("Test Started");
	  String d = "Dinesh";
	  String c = "dinesh";
	  Assert.assertEquals(d, c);
	  System.out.println("After First Assertion");
	  System.out.println("hi hhh");
	  System.out.println("hi hhh");
 
  
  }
}
