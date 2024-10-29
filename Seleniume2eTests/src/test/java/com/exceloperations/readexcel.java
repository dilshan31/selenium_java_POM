package com.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class readexcel {
	public static void main(String[] args) throws IOException {
		String excelPath = "C:\\Users\\Amanda\\automation\\Seleniume2eTests\\DataFiles\\TC_01.xlsx";
		FileInputStream inputStream = new FileInputStream(excelPath);

		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();

		for(int i=0; i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell);
			
				System.out.print("|");

			}
			//System.out.println();

		}

	}

}
