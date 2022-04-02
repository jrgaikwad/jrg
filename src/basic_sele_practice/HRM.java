package basic_sele_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM {
	//Step-I: Main Method
	public static void main(String[] args) throws InterruptedException {
		
	//Step-II:Configure WebDriver with BrowserDriver
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		
		
	//Step-III: Object Creation
		
		WebDriver d = new FirefoxDriver();
		
	//Step-IV: Maximize the Browser
		d.manage().window().maximize();
	
		//Step-IV: Perform Operations
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement u = d.findElement(By.id("txtUsername"));
		
		u.sendKeys("Admin");
		Thread.sleep(3000);
		
		WebElement p = d.findElement(By.id("txtPassword"));
		
		p.sendKeys("admin123");
		Thread.sleep(3000);
		
		WebElement b = d.findElement(By.name("Submit"));
		b.click();
		

	}
}
