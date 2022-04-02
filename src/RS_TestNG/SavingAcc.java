package RS_TestNG;

import org.testng.annotations.Test;

public class SavingAcc {
  @Test (groups= {"sanity"})
  public void accdetails() {
	  System.out.println("Acc Balance");
  }
  
  @Test (groups= {"regression"})
  public void balancetransfer () {
	  System.out.println("Transfer Bal");
  }
  
  
}
