package com.RS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class QAClicklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("http://www.qaclickacademy.com");
		
		WebElement ID=d.findElement(By.xpath("//input[@autofocus='autofocus']")); 
		WebElement PW=d.findElement(By.id("user_password"));
		WebElement Submit=d.findElement(By.xpath("//input[@type='submit']"));
		WebElement Signin=d.findElement(By.cssSelector("a[href*='sign_in']"));
		WebElement ele = d.findElement(By.xpath("//button[contains(text(),'NO THANKS')]"));
		ele.click();
		Signin.click();
		ID.sendKeys("abc@gmail.com");
		PW.sendKeys("355353");
		Submit.click();
	}

}
