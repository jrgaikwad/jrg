package class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviTestNG2 {
WebDriver driver;
	
	@BeforeClass
	public void init() {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\SW Testing\\Browser Drivers\\chromedriver.exe"); 
		
		//Step-1
		driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
	}
	
	@Test (dataProvider="testData", enabled=false)
	public void login(String username, String password) throws InterruptedException {
		//username
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		Thread.sleep(2000);
	}
	
	@Test (dataProvider="testData")
	  public void login2(String uname, String pword) throws InterruptedException {
	
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(pword);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		  driver.findElement(By.id("welcome")).click();
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(5000);
	  }
	
	@DataProvider (name="testData")
	public String [][] getData() {
		
		String [][] data= {{"Admin","admin123"},{"efg@gamil.com","efg@123"},
				{"jkl@gamil.com","jkl@123"},{"xyz@gamil.com","xyz@123"}};
		return data;
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
	}
}
