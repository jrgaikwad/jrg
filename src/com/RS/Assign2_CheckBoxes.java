package com.RS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign2_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		WebElement checkbox = d.findElement(By.xpath("//input[@type='checkbox'][1]"));
		System.out.println(checkbox.isSelected());
		if (checkbox.isSelected()) {
			
		}
		
		

	}

}
