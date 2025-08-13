package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode { 
	  
 	static FileInputStream f; //to read excel file from the system
 	static XSSFWorkbook w; //to represent the entire workbook
 	static XSSFSheet sh; //  to represent sheet
  
 	public static String readStringData(int row, int col) throws IOException { // method to read data
 		f = new FileInputStream("C:\\Users\\user\\git\\Sample\\mavenproject\\src\\main\\resources\\Excelbook.xlsx"); // to open excel file
 		w = new XSSFWorkbook(f); //apache poi is used to load the excel file to memory
 		sh = w.getSheet("Sheet1"); //selecting particular sheet
 		XSSFRow r = sh.getRow(row); // to get rows
 		XSSFCell c = r.getCell(col); // to get rowcell according to coloumn no.
 		return c.getStringCellValue(); // return string cell content
  
 	} 
  
 	public static String readIntegerData(int row, int col) throws IOException   { 
 		f = new FileInputStream("C:\\Users\\user\\git\\Sample\\mavenproject\\src\\main\\resources\\Excelbook.xlsx"); 
 		w = new XSSFWorkbook(f); 
 		sh = w.getSheet("Sheet1"); 
 		XSSFRow r = sh.getRow(row); 
 		XSSFCell c = r.getCell(col); 
 		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting 
 		return String.valueOf(val);   //convert int to string using valueOf() method 
 		//return val; 
 	 
 	} 
  
 }