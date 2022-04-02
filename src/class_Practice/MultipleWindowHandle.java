package class_Practice;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();

	//Step-3 
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	//Step-4
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)");
	
	//step-4-a findout parent window address
	String parentTab=driver.getWindowHandle();
	System.out.println(parentTab);
	System.out.println(driver.getTitle());
	
	//step-5
	WebElement tabButton=driver.findElement(By.xpath("//*[@id='opentab']"));
	
	tabButton.click();
	Thread.sleep(2000);
	
	//step-6 navigation between tabs
	Set<String> allTabs=driver.getWindowHandles();
	
	//step-7- navigate to child tab
	for (String tab: allTabs) {
		
		System.out.println(tab);
		System.out.println(driver.getTitle());
		if (!parentTab.equalsIgnoreCase(tab)) {
			
			driver.switchTo().window(tab);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		
	}
	
	//step-8 navigate back to parent tab
	driver.switchTo().window(parentTab);
	System.out.println(driver.getTitle());
	
	Thread.sleep(8000);
	driver.quit();
	

}

}

