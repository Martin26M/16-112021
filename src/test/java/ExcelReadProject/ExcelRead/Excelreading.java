package ExcelReadProject.ExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {
	
	public ArrayList<String> readData(String testcaseName) throws IOException {
		
		
	 File infile = new File("C:\\Users\\HP\\Downloads\\DatadriverExcel\\datadriven.xlsx");
	   FileInputStream fis = new FileInputStream(infile);

	   
	   ArrayList<String> a= new ArrayList<String>();
	   
	   XSSFWorkbook workbook  = new XSSFWorkbook(fis);
	    int sheetcount =  workbook.getNumberOfSheets();
	   
	   for (int i=0; i<sheetcount;i++) {
		   
		String sheetname=   workbook.getSheetName(i);
		   
		if (sheetname.equalsIgnoreCase("testdata")) {
			
			
			 
			XSSFSheet sheet= workbook.getSheetAt(i);
			
			Iterator<Row> rows =	sheet.iterator();
			
			 Row firstrow = rows.next();
			 

		
			 while(rows.hasNext()) {
				 
				 
			Row r= 	 rows.next();
			
			
			Iterator<Cell> ce1=	r.cellIterator();
				 
			while (ce1.hasNext()){
				
				
				a.add(ce1.next().getStringCellValue());
				
			}
			 }
		
		}
	   }
	return a;
	 
	
	
	
	
	
	
	
	}
	
	
	
	
}
