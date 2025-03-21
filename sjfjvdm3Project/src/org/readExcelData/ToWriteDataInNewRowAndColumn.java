package org.readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataInNewRowAndColumn {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("./testData/TestData.xlsx"); //To Specify the path of excel file
		
		Workbook wb = WorkbookFactory.create(fis); //To make the file ready to read
		
		Sheet sheet = wb.getSheet("ipl");  //To get into the desired sheet
		
		Row row = sheet.createRow(10); //to create new row
		
		Cell cell  = row.createCell(0); // To create a column1 for new row
		
		cell.setCellValue("PUNJAB KINGS"); //To set the value of a column1
		
		Cell cell1  = row.createCell(1); // To create a column2 for new row
		cell1.setCellValue("DHONI"); //To set the value of a column2
		
		FileOutputStream fos = new FileOutputStream("./testData/TestData.xlsx");
		wb.write(fos); //To write the data in excel file
		System.out.println("data entered successfully");
	}

}
