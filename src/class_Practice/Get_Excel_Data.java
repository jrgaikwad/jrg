package class_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Excel_Data {
	
	public static String readExcel(int r, int c) throws IOException {
		String path = System.getProperty("user.dir")+"\\DataFile2.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String cellvalue = sheet.getRow(r).getCell(c).getStringCellValue();
		wb.close();
		return cellvalue;
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		WebElement UN = driver.findElement(By.id("txtUsername"));
		WebElement PW = driver.findElement(By.id("txtPassword"));
		
		UN.sendKeys(readExcel(0,0));
		Thread.sleep(3000);
		PW.sendKeys(readExcel(0,1));
		Thread.sleep(3000);
		WebElement loginbtn = driver.findElement(By.id("btnLogin"));
		loginbtn.click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
