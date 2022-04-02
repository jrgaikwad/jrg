package basic_sele_practice;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class FlipkartPage {

		public static void main(String[] args) throws InterruptedException {
				//Step-I :Configuring Webdriver with BrowserDriver
				System.setProperty("webdriver.gecko.driver", "F:\\SW Testing\\Browser Drivers\\geckodriver.exe");
				
				WebDriver d= new FirefoxDriver();
				d.manage().window().maximize();
				d.get("https:flipkart.com");
				
				
				
				WebElement username= d.findElement(By.name("txtUsername"));
//				String t= username.getText();
//				System.out.println(t);
//				
//				d.close();
				username.sendKeys("Admin");
				
				
				WebElement password = d.findElement(By.id("txtPassword"));
				password.sendKeys("admin123");
				
				Thread.sleep(8000);
				
				WebElement loginbutton= d.findElement(By.name("Submit"));
				loginbutton.click();
							
				Thread.sleep(8000);
				d.close();
				
		}

	}



