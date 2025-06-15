package org.apache.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook();
		// XSSFSheet sheet0 = new XSSFSheet();// The constructor XSSFSheet() is not visible (Private Constructor)
		XSSFSheet sheet0 = workBook.createSheet("First Sheet");
		
		/*
		 * Row row0 = sheet0.createRow(0); 
		 * Cell cellA = row0.createCell(0); 
		 * Cell cellB = row0.createCell(1); 
		 * cellA.setCellValue("First Cell");
		 * cellB.setCellValue("Second Cell");
		 * 
		 * Row row1 = sheet0.createRow(1); 
		 * Cell cellA1 = row1.createCell(0); 
		 * Cell cellB1 = row1.createCell(1); 
		 * cellA1.setCellValue("First Cell");
		 * cellB1.setCellValue("Second Cell");
		 */
		
		for(int row = 0; row<10; row++) {
			Row row0 = sheet0.createRow(row);
			for(int cell = 0; cell < 10; cell++) {
				Cell cellA = row0.createCell(cell);
				cellA.setCellValue((int)(Math.random()*100));
			}
		}

		File f = new File(System.getProperty("user.dir") + "/src/main/java/org/apache/poi/myFirstExcel4.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workBook.write(fo);
		workBook.close();
		System.out.println("File created !!!");
	}

}
