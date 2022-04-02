package com.RS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Moveover_CapitalLetters {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in");
		
		Actions act = new Actions(d);
		act.moveToElement(d.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(d.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		Thread.sleep(8000);
		
		d.close();
	}

}
