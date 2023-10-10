package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String readDataFromProperty(String key) throws IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resources/Data/commondata.property");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	
}
public void writeDataIntoExcel(String Sheet,int row,int col,String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resources/Data/testscript.xlsx");
	Workbook w = WorkbookFactory.create(fis);	
	w.getSheet(Sheet).getRow(row).getCell(col).setCellValue(value);
		
	FileOutputStream fos = new FileOutputStream("./src/test/resources/Data/testscript.xlsx");
	
	w.write(fos);
}
public String readDataFromExcel(String Sheet,int row,int col) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./src/test/resources/Data/testscript.xlsx");
	Workbook w = WorkbookFactory.create(fis);
    String value = w.getSheet(Sheet).getRow(row).getCell(col).getStringCellValue();
	return value;
}
}
