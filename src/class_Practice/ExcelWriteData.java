package class_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelWriteData {
	public static int rowValue=3;
	public static void WriteExcel(int r, int c, String s) throws IOException {
				
				//Step-I: Getting FilePath which is to be accessed
				String path = System.getProperty("user.dir")+"\\DataFile3.xlsx";
				
				//Step-II: Creating File in the Script
				File file = new File(path);
				
				//FileInputSream to read data
				FileInputStream fis = new FileInputStream(file);
				
				//WorkbookFactory class to access spreadsheet
				XSSFWorkbook wb = new XSSFWorkbook (fis);
				
				//XSSFSheet interface to use its methods to perform operations on sheet
				XSSFSheet sheet = wb.getSheetAt(1);
				sheet.createRow(r).createCell(c).setCellValue(s);
				
				//FileOutputSream to read data
				FileOutputStream fos = new FileOutputStream(file);
				
				wb.write(fos);
				wb.close();
	}
	
	public static void readExcel(int x, int y) throws IOException {
String path	= System.getProperty("user.dir")+"\\DataFile3.xlsx";
		
		//Reaching a file in Script
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream (file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(1);
		
		int lastrow = sheet.getLastRowNum();
		System.out.println(lastrow);
	
		for (int i=0;i<lastrow;i++) {
			String cellvalue = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(cellvalue);
		}
		System.out.println(sheet.getRow(x).getCell(y).getCellType());
	
		wb.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver", "F:\\SW Testing\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		List <WebElement> data = driver.findElements(By.xpath("//*[@id='product']/tbody/tr/td[3]"));
		int col=0;
		
		for (WebElement ele:data) {
			System.out.println(ele.getText());
			WriteExcel(rowValue, col, ele.getText());
			rowValue++;
			
		}
		
		readExcel(3,0);
	}

}
