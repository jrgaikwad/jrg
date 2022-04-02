package basic_sele_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SW Tes\\Testing drivers\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		
		String actualtitle= d.getTitle();
		System.out.println(actualtitle);
		String expectedtitle= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Title Matched, Test case Passed");
		}
		else {
			System.out.println("Title Mismatched, Test case Failed");
		}
		
		Thread.sleep(5000);
		d.close();
	}
}
