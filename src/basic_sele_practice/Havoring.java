package basic_sele_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Havoring {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		
		WebDriver d= new EdgeDriver();
		
		d.manage().window().maximize();
		d.get("https://demoqa.com/menu/#");
		
		WebElement havor = d.findElement(By.xpath("//a[text()= 'Main Item 2']"));
		WebElement subele = d.findElement(By.xpath("//a[text()= 'Main Item 2']"));
//		d.switchTo().frame(havor);
//		Thread.sleep(3000);
		Actions act = new Actions(d);
		
		act.moveToElement(havor).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(3000);
		
	}

}
