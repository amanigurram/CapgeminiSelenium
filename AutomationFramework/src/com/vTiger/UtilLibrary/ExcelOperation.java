package com.vTiger.UtilLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation
{

	public static String readData(String sheetName, int rowNumber, int cellNumber)
	{
		try
		{
			FileInputStream fis = new FileInputStream(".\\src\\resources\\testdata\\Book1.xlsx");
			  Workbook w1   =WorkbookFactory.create(fis);
		String data = w1.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
			return data;
		}
		catch(Exception rv1)
		{
			return "";
		}
	}
	
	public static void writeData(String sheetName, int rowNumber, int cellNumber, String data)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(".\\src\\resources\\testdata\\Book1.xlsx");
			Workbook w1 = WorkbookFactory.create(fis);
			w1.getSheet(sheetName).createRow(rowNumber).createCell(cellNumber).setCellValue(data);;
			FileOutputStream fos = new FileOutputStream(".\\src\\resources\\testdata\\Book1.xlsx");
			w1.write(fos);
			
		} 
		catch (Exception rv1) 
		{
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
