package org.pomPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		//instead of hard code value create parameterized method
		//FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		
		//Sheet sheet = wb.getSheet("validlogincreds");
		//Row row = sheet.getRow(0);
		//Cell cell = row.getCell(0);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		
		//String data = cell.getStringCellValue(); // Read String value only
		String data= cell.toString(); // Read all type of data like Number, String Date, Boolean 
		return data;
	}
	
	public String readPropertyData(String propPath, String key) throws IOException {
		//instead of hard code value create parameterized method
		//FileInputStream fis = new FileInputStream("./testData/config.properties");
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		//String data = prop.getProperty("url");
		String data = prop.getProperty(key);
		return data;
	}
	
	public int lastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath); //To Specify the path of excel file
		Workbook wb = WorkbookFactory.create(fis); //To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName); //To get into the desired sheet
		int rc = sheet.getLastRowNum(); //To count the no.of rows
		return rc;
		}
	

		public void writeDataInExcelsheet(String excelPath, String sheetName, int rowNo, int cellNo, String cellValue) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath); //To Specify the path of excel file
		Workbook wb = WorkbookFactory.create(fis); //To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);  //To get into the desired sheet
		Row row = sheet.createRow(rowNo); //to create new row
		Cell cell  = row.createCell(cellNo); // To create a column for new row
		cell.setCellValue(cellValue); //To set the value of a column1
		
			
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos); //To write the data in excel file
		
		}
	
}