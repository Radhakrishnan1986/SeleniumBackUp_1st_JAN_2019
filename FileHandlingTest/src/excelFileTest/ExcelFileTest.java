package excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Nihith\\Desktop\\test.xls");
		FileInputStream fis = new FileInputStream(f);
		//xls -> HSSF -> 2003<
		//xlsx ->XSSF 2003> 
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum() + 1;
		int col = sheet.getRow(0).getLastCellNum();
		for (int rownum = 0; rownum < row; rownum++) {
			for (int colnum = 0; colnum < col; colnum++) {
				// sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				// The above line is to set all the cells in the Xl as String value(Even numeric
				// is considered as string)
				// String data = sheet.getRow(i).getCell(j).getStringCellValue();
				// System.out.print(data+" ");

				if (sheet.getRow(rownum).getCell(colnum).getCellType() == Cell.CELL_TYPE_STRING) {
					String data = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
					System.out.print(data + " ");
				} else if (sheet.getRow(rownum).getCell(colnum).getCellType() == Cell.CELL_TYPE_NUMERIC) {
					int data = (int) sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
					System.out.print(data + " ");

				}
			}
			System.out.println();			
		}
		fis.close();//To close the open Fis
		// to replace the existing cell the below program can be used. new cell will not be able to write in other cells
		FileOutputStream fos = new FileOutputStream(f);
		sheet.getRow(1).getCell(1).setCellValue("Vmetry");
		workbook.write(fos);
	}
}