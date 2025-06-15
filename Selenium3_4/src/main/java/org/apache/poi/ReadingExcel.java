package org.apache.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		File f = new File(System.getProperty("user.dir") + "/src/main/java/org/apache/poi/myFirstExcel4.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workBook = WorkbookFactory.create(fi);
		
		Sheet sheet0 = workBook.getSheetAt(0);
		// Row row0 = sheet0.getRow(0);
		// Cell cellA = row0.getCell(0);
		// System.out.println(cellA);
		
		
		for(int row = 0; row < 10; row ++) {
			Row row0 = sheet0.getRow(row);
			for(int cell = 0; cell<10; cell++) {
				Cell cellA = row0.getCell(cell);
				System.out.print(cellA + "\t");
			}
			System.out.println("");
		}
		workBook.close();
	}

}
