package class_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFromList {

	public static String readExcel(int r, int c) throws IOException {
		String path = System.getProperty("user.dir")+"\\DataFile4.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		String cellvalue = sheet.getRow(r).getCell(c).getStringCellValue();
		wb.close();
		return cellvalue;
	}
	public static void main(String[] args) throws IOException {
		
		String path =System.getProperty("user.dir")+"\\DataFile4";
		
		//for serial no 1 to 10
		int [] serial = new int [10];
		for(int i=0;i<serial.length;i++) {
			serial[i]=i+1;
		}
		
		//for coulmn 1 data
		
		String [] std_name =new String[10];
		std_name [0] ="Amar";
		std_name [1] = "Akabar";
		std_name [2] = "Anthony";
		std_name [3] = "John";
		std_name [4] ="Bravo";
		std_name [5] ="Thala";
		std_name [6] = "Jaddu";
		std_name [7] = "Deepak";
		std_name [8] = "Raina";
		std_name [9] = "Ruturaj";
		
		
		String [] result = new String [10];
		std_name [0] ="Passed";
		std_name [1] = "Failed";
		std_name [2] = "Passed";
		std_name [3] = "Failed";
		std_name [4] ="Passed";
		std_name [5] ="Passed";
		std_name [6] = "Passed";
		std_name [7] = "Failed";
		std_name [8] = "Failed";
		std_name [9] = "Passed";

		//Create Workbook
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("ResultData");
		
		XSSFRow row = sheet.createRow(0);
		Cell cell0=row.createCell(0);
		Cell cell1=row.createCell(0);
		Cell cell2=row.createCell(0);
		
		for (int r=0;r<serial.length;r++) {
			row = sheet.createRow(r+1);
			for (int c=0;c<3;c++) {
				Cell cell =row.createCell(c);
				if(cell.getColumnIndex()==0) {
					cell.setCellValue(serial[r]);
				}
				else if(cell.getColumnIndex()==1) {
					cell.setCellValue(std_name[r]);
					}
				else if (cell.getColumnIndex()==2) {
					cell.setCellValue(r);
				}
			}
		}
		
		FileOutputStream out = new FileOutputStream(path);
		wb.write(out);
		System.out.println("File is Generated");
		try {
		for (int j=0;j<serial.length;j++) {
			System.out.println(readExcel(j,1));
		}}
		catch(Exception e){
			
		}
	}

}
