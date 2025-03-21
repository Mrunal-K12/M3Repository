package org.readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//to specify the location of the file
		 FileInputStream fis = new FileInputStream("./testData/config.properties");
		 
		//to make the file ready to read
		Properties prop = new Properties();
		prop.load(fis);
		
		//To read the data from property file
		String data = prop.getProperty("url");
		System.out.println(data);
		
		//String emailData = prop.getProperty("email");
		//System.out.println(emailData);
		
		//String passwordData = prop.getProperty("password");
		//System.out.println(passwordData);
		
	}

}
