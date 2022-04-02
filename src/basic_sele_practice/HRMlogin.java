package basic_sele_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMlogin {

	public static void main(String[] args) throws InterruptedException {
			//Step-I :Configuring Webdriver with BrowserDriver
			System.setProperty("webdriver.gecko.driver", "F:\\SW Testing\\Browser Drivers\\geckodriver.exe");
			
			WebDriver d= new FirefoxDriver();
			d.manage().window().maximize();
			d.get("https://opensource-demo.orangehrmlive.com");
			
			
			
			WebElement username= d.findElement(By.name("txtUsername"));
			String t= username.getText();
			System.out.println(t);
			
			username.sendKeys("Admin");
			
			
			WebElement password = d.findElement(By.id("txtPassword"));
			password.sendKeys("admin123");
			
			Thread.sleep(4000);
			
			WebElement loginbutton= d.findElement(By.name("Submit"));
			loginbutton.sendKeys(Keys.ENTER);  //another way to click
						
			Thread.sleep(8000);
			d.close();
			
	}

}
