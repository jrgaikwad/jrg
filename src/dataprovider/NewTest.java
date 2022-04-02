package dataprovider;
//SCRIPT NOT WORKING
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
 
	@Test (dataProvider="testData")
  public void login(String uname, String pword) throws InterruptedException {
		System.out.println(uname);
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(uname);
	Thread.sleep(5000);
	System.out.println(pword);
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pword);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//a[text()='Logout']"));
	  Thread.sleep(5000);
  }
  
  @BeforeClass
  public void beforeClass() {
	 System.setProperty("webdriver.chrome.driver", "F:\\SW Testing\\Browser Drivers\\chromedriver.exe"); 
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.manage().window().maximize();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com");
  }

  @AfterClass
  public void afterClass() {
  driver.close();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test Completed");
  }

  @DataProvider (name="testData")
  public String [] [] getData() {
	String [] [] data = {{"Admin", "admin123"}, {"ADMIN","ADMIN123"}};
	return data;
}
}
