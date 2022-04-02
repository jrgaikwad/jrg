package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BLaunch {

	public static void main(String[] args) throws InterruptedException {
	
			 System.setProperty("webdriver.chrome.driver", "F:\\SW Testing\\Browser Drivers\\chromedriver.exe"); 
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://opensource-demo.orangehrmlive.com");
		  
			 driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='Submit']")).click();
				Thread.sleep(2000);
	
	}
}
