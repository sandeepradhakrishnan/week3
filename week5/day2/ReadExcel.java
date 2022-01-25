package week5.day2;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		XSSFWorkbook wb =new XSSFWorkbook("./data/exceldata.xlsx");
		XSSFSheet ws =wb.getSheetAt(0);
	int rowCount =	ws.getLastRowNum();
	System.out.println( rowCount);
	int rows = ws.getPhysicalNumberOfRows();
	System.out.println( rows );
	XSSFRow header = ws.getRow(0);
	int columncount= header.getLastCellNum();
		System.out.println(columncount);
		String [][] data= new String[rowCount][columncount];
		
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columncount; j++) {
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				
				data[i-1][j]=cellValue;	
				
		

	}

		}
	}
}
	

