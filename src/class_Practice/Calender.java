package class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://jqueryui.com/datepicker/");
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 300)");
		
		WebElement frame1 = d.findElement(By.xpath("//iframe[@class='demo-frame']"));
		d.switchTo().frame(frame1);
		
		WebElement date = d.findElement(By.xpath("//input[@class='hasDatepicker']"));
		
		date.click();
		Thread.sleep(15000);
		
		while (true) {
		String monthTitle=d.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		
		if (!monthTitle.equalsIgnoreCase("March 2020")) {
			
			d.findElement(By.xpath("//a[@data-handler='prev']")).click();
		}	
		else {
				System.out.println(monthTitle);
				break;
			}
		
		//Another way for above whileloop
		
//		WebElement monthTitle =d.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
//		while(!monthTitle.getText().contains("March 2020")) {
//			d.findElement(By.xpath("//a[@data-handler='prev']")).click();
//		}
		
		Thread.sleep(8000);
			int no=23;
			d.findElement(By.xpath("//a[@data-date='"+no+"']")).click();
			Thread.sleep(5000); 
			d.close();
		}
		}
}