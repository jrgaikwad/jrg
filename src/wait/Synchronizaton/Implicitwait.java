package wait.Synchronizaton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		
		System.out.println(driver.findElement(By.id("welcome")).getText());
		driver.findElement(By.id("welcome")).click();
		
		 WebElement logoutLink=driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']"));
		
		 logoutLink.click();
		 Thread.sleep(3000); //just to see not necessary
		//System.out.println(driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li/a) [3]//a[text()='Logout']")).getText());
		//driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li/a) [3]//a[text()='Logout']")).click();
	driver.close();
	}
}


