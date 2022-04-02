package class_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectChechBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0, 600)");
		
		WebElement checkbox = d.findElement(By.xpath("//input[@type='checkbox']"));
	
		Select sel = new Select(checkbox);
		
		List <WebElement> option = sel.getOptions();
		for (WebElement el1:option) {
			el1.click();
			System.out.println(el1.getText());
			Thread.sleep(2000);
		
		d.close();
		}

}
}
