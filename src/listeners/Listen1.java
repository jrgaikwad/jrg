package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listen_imple.class)  //for implementing listener at class level
public class Listen1 {
		String d = "Dinesh";
	  String c = "dinesh";
	  String n = null;
	
	
	@Test
  public void mytest1() {
		System.out.println("Entered in Test1");
		Assert.assertNotEquals(c, d,"Assdgsdg Passed");
		
	
  }
  
  @Test
  public void mytest2() {
	  System.out.println("Entered in Test2");
		Assert.assertEquals(c, d);
	
  }
  
  @Test (dependsOnMethods = "mytest2")
  public void mytest3() {
	  System.out.println("Entered in Test3");
		Assert.assertTrue(true);
	
  }
}
