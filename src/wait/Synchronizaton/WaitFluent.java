package wait.Synchronizaton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WaitFluent {
	public static WebDriver driver;
	@BeforeClass
	public void init() {
		
		
		
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		//step-4 Implicitly waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
		
	@Test
	public void click() {
		
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
		//This is what we will explore more in this chapter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='hidden']")));
		driver.findElement(By.xpath("//*[@id='hidden']")).getText();
	}
	@Test (priority=1)
	  public void login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click(); 
		
		FluentWait <WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
		  WebElement button=driver.findElement(By.xpath("//*[@id='hidden']"));
		  wait.until(ExpectedConditions.visibilityOf(button));
		  
		  
		  System.out.println(button.getText());
			
	  }
	 
	  @AfterClass
	  public void tearDown() {
		  driver.close();
	  }

}
