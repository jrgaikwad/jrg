package class_Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollDownJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://demo.guru99.com/test/newtours");
		
		//Scrolling
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,280)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-280)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(5000);
		
		WebElement join = dr.findElement(By.linkText("Register here"));
		
		join.click();
		Thread.sleep(5000);
		dr.close();	
	}

}
