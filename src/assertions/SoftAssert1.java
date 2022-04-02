package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
  @Test
  public void f() {
	  System.out.println("Test Started");
	  String d = "Dinesh";
	  String c = "dinesh";
	  String n = null;
	 
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(d, c);
	  System.out.println("After First Soft Assertion");
	  Assert.assertNull(n);
	  System.out.println("Aster second assertion");
	  
  }
}
