package class_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintTagNames {

	public static void main(String[] args) {
		//Step-I: Browser Configure
		
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		
		//Step-II: Create Object
		WebDriver d = new EdgeDriver();
		
		//Step-III: Maximize Browser
		d.manage().window().maximize();
		
		//Step-IV: Launch Website
		d.get("https://rahulshettyacademy.com/AutomationPractice");
		
		//Step-V: Find Element  with input tagname
		WebElement username = d.findElement(By.tagName("label"));
		System.out.println(username.getTagName());
		
		//Step-V:Find all elements with input tagname
		List <WebElement> ele = d.findElements(By.tagName("label"));
		
		//Step-V:Printing all elements with input tag
		for (WebElement i: ele) {
			System.out.println(i.getTagName());
		}
		
		d.close();
	}

}
