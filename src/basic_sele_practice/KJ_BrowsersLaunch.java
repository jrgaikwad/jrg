package basic_sele_practice;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class KJ_BrowsersLaunch implements KJ_CommonProperties{
	static WebDriver d ;
	public void startBrowser() {
	System.out.println("Your Favourite Browser Started");
	}
	public void launchChrome() throws InterruptedException {
	System.setProperty(key1, value1);
	d = new ChromeDriver();
	d.manage().window().maximize();
	Thread.sleep(4000);
	d.get("https://en-gb.facebook.com/r.php");
	Thread.sleep(4000);
	}
	public void launchfirefox() throws InterruptedException {
	System.setProperty(key2, value2);
	d = new FirefoxDriver();
	d.manage().window().maximize();
	Thread.sleep(4000);
	d.get("https://www.amazon.in/");
	Thread.sleep(4000);
	}
	public void endBrowser() {
	d.close();
	System.out.println("Your Favourite Browser Closed");
	}
	
}
