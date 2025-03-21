package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WriteDataInExcelSheet implements IAutoConstant{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Flib flib = new Flib();
	 flib.writeDataInExcelsheet(EXCEL_PATH, VALIDLOGINCREDS, 3, 0,"mrunal");
	flib.writeDataInExcelsheet(EXCEL_PATH, VALIDLOGINCREDS, 3, 1, "password");
	flib.writeDataInExcelsheet(EXCEL_PATH, VALIDLOGINCREDS, 3, 0, "Selenium");
//	System.out.println(email);
//	System.out.println(password);
//	
	}

}
