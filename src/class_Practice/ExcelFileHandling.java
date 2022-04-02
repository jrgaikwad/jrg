package class_Practice;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileHandling {
	
public static void main(String[] args) throws InterruptedException, IOException {
		//Step-I:Getting a File whose data need to be accessed
		String path	= System.getProperty("user.dir")+"\\DataFile.xlsx";
		
		//Reaching a file in Script
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream (file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int lastrow = sheet.getLastRowNum();
		System.out.println(lastrow);
	
		for (int i=0;i<lastrow;i++) {
			String cellvalue = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(cellvalue);
		}
		System.out.println(sheet.getRow(0).getCell(0).getCellType());
		wb.close();
}
}
