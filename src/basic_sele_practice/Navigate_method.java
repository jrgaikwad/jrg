package basic_sele_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\SW Testing\\Browser Drivers\\chromedriver.exe");
	
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.navigate().to("https://www.javatpoint.com/");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
	}

}
