package com.RS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RSAssgn1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,350)");
		
		WebElement name= d.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Jeevan");
		Thread.sleep(8000);
		d.close();	
	}

}
