package class_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class SelectClass_Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor je =(JavascriptExecutor) d;
		je.executeScript("window.scrollBy(0,600)");
		
		WebElement dropdown = d.findElement(By.xpath("//input [@type='radio']"));
		Select sel = new Select(dropdown);
		
		List<WebElement> opt=sel.getOptions();
				 
		 for (WebElement el1:opt) {
			 el1.click();
			 Thread.sleep(3000);
			 System.out.println(el1.getText());
		 }
		
		Thread.sleep(3000);
		d.close();

	}
	}
