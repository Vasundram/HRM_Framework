package com.Commanmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdatareader {
	public static XSSFWorkbook xsw;
	
	public static String Testdatapath="E:\\vss\\HRM_UIApplication\\TestData\\Testdataonpages.xlsx";
	public static void  excelworkbook() throws IOException
	{
		
		File f=new File(Testdatapath);
		FileInputStream fis=new FileInputStream(f);
		xsw=new XSSFWorkbook(fis);
	}
	
	public static String getcelldata(String sheetname,int rownum,int columnnum) throws IOException {
		Testdatareader.excelworkbook();
		System.out.println(" cell datat: "+xsw.getSheet(sheetname).getRow(rownum).getCell(columnnum).getStringCellValue());
	  return xsw.getSheet(sheetname).getRow(rownum).getCell(columnnum).getStringCellValue();
	}
}


