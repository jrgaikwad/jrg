package wait.Synchronizaton;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit wait
		wt.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.cssSelector("button#populate-text")).click();
		wt.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='h2']"),"Selenium Webdriver"));
		System.out.println(driver.findElement(By.xpath("//h2[@id='h2']")).getText());
		
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		System.out.println(wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']"))).getText());
		
		//OR
		// WebElement expwt =wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
		//System.out.println(expwt.getText());
		
		driver.close();

	}

}
