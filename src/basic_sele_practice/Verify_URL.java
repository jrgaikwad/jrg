package basic_sele_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_URL {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SW Tes\\Testing drivers\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://calendar.google.com/calendar/u/0/r?tab=mc");
		
		String url= d.getCurrentUrl();
		System.out.println(url);
		String expectedurl= "https://calendar.google.com/calendar/u/0/r?tab=mc";
		
		if(url.equals(expectedurl)) {
			System.out.println("URL Matched, Test case Passed");
		}
		else {
			System.out.println("URL Matched, Test case Failed");
		}
		
		Thread.sleep(5000);
		d.close();
	}

}
