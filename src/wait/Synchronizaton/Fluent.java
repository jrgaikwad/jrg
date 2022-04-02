package wait.Synchronizaton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click(); 
		//Declare and initialise a fluent wait
		//FluentWait wait = new FluentWait(driver);
		FluentWait <WebDriver>wait=new FluentWait<WebDriver>(driver);
		
		//Specify the timout of the wait
		wait.withTimeout(Duration.ofSeconds(20));
		
		//Sepcify polling time
		wait.pollingEvery(Duration.ofSeconds(2));
		
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='hidden']")));
		driver.findElement(By.xpath("//*[@id='hidden']")).getText();
	
	}
}
