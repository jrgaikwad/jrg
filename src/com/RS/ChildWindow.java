package com.RS;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/loginpagePractise/");
		d.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		String parentTab = d.getWindowHandle();
		
		Set <String> alltabs =d.getWindowHandles();
		String emailID;
		for(String tab:alltabs) {
			if (!tab.equalsIgnoreCase(parentTab)) {
				d.switchTo().window(tab);
			}
			}
		emailID = d.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);

//		Iterator <String> it = alltabs.iterator();
//		String parentTab =it.next();
//		String childTab = it.next();
	
		//d.switchTo().window(childTab);
		//String paragraph= d.findElement(By.xpath("//p[@class='im-para red']")).getText();
		//d.findElement(By.xpath("//p[@class='im-para red']")).getText();
		//String email = d.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		//System.out.println(email);
		Thread.sleep(5000);
		d.switchTo().window(parentTab);
		Thread.sleep(5000);
		d.findElement(By.id("username")).sendKeys(emailID);

	Thread.sleep(2000);
	d.close();
	}

}

