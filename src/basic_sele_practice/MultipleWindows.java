package basic_sele_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\SW Testing\\Browser Drivers\\chromedriver.exe");
		
		//Step=1
				WebDriver driver=new ChromeDriver();
				
				//Step=2
				driver.manage().window().maximize();
				
				//Step-3 
				driver.get("https://www.naukri.com");
				
				//Scroll
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,100)");
				Thread.sleep(5000);
				//step-4-a findout parent window address
				String parentTab=driver.getWindowHandle();
				System.out.println("Parent Window Handle : "+ parentTab);
				System.out.println(driver.getTitle());

				
				
				//step-5
				WebElement RegisterBtn=driver.findElement(By.xpath("//div[text()='Register']"));
				
				RegisterBtn.click();
				Thread.sleep(3000);
				
				//step-6 navigation between tabs
				Set<String> allTabs=driver.getWindowHandles();
				
				//step-7- navigate to child tab
				for (String tab: allTabs) {
					
					if (!parentTab.equalsIgnoreCase(tab)) {
						
						driver.switchTo().window(tab);
						System.out.println("Child Window Handle : "+ tab);
						System.out.println(driver.getTitle());
						Thread.sleep(5000);
					}
					
				}
				
				//step-8 navigate back to parent tab
				driver.switchTo().window(parentTab);
				System.out.println(driver.getTitle());
				
				Thread.sleep(8000);
				driver.quit();
				

	}

}
