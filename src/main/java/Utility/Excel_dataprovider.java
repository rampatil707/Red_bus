package Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_dataprovider {
XSSFWorkbook wb;
	
	public Excel_dataprovider() throws Exception {
		String path="C:\\Users\\Hp\\eclipse-workspace\\New_Red_Bus\\Test_data\\my_Testing_data.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
			
	}
	
	public String getStringData_Excel(String SheetName,int row,int cell) {
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}

}
