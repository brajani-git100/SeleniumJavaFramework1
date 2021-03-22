package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
	}
	public static void getRowCount() {
		try {
			//String ProjectPath=System.getProperty("user.dir");
			
			XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\USER\\eclipse-workspace\\HelloWorld\\excel\\data.xlsx");
			//XSSFWorkbook workbook1=new XSSFWorkbook("C:\\Users\\USER\\eclipse-workspace\\HelloWorld\\excel\\data.xlsx");
			XSSFSheet sh=wb.getSheetAt(0);
			//XSSFSheet sheet=workbook1.getSheet("Sheet1");
			int RowCount=sh.getPhysicalNumberOfRows();
			System.out.println("no of rows="+ RowCount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
