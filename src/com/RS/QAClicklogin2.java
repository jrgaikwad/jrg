package com.RS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class QAClicklogin2 {
	WebDriver d;
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("http://www.qaclickacademy.com");
		
		d.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click();
		d.findElement(By.cssSelector("a[href*='sign_in']")).click();
		WebElement un=d.findElement(By.xpath("//input[@name='email']"));
		WebElement pw=d.findElement(By.id("user_password"));
		WebElement sub=d.findElement(By.xpath("//input[@type='submit']"));
		un.sendKeys("adfdfgd");
		pw.sendKeys("365346");
		sub.click();
		
	}
}
