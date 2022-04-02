package basic_sele_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSele {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://meet.google.com/?authuser=0");
			

	}

}
