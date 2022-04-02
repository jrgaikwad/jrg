package class_Practice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		
		d.get("https://artoftesting.com/ecommerce");
		
		JavascriptExecutor je = (JavascriptExecutor)d;
		je.executeScript("window.scrollBy(0,100)");
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File capturedScreen = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(System.getProperty("user.dir")+"\\ScreenShots\\screen2.png");
		//File destination = new File("F:\\Eclipse\\G1_Selenium\\ScreenShots\\screen1.png");
		
		FileHandler.copy(capturedScreen, destination);
		
		Thread.sleep(5000);
		d.close();

	}

}
