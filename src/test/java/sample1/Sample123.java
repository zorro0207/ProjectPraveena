package sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample123 {
	public static void main(String[] args) throws IOException {
		File f1= new File("E:\\workspace\\sample1\\Testcase\\STUDENT.xlsx");
		FileInputStream fs= new FileInputStream(f1);
		FileOutputStream o=new FileOutputStream(f1);
		
		Workbook w= new XSSFWorkbook(fs);
		Sheet s1 = w.getSheet("praveena");
		Row r2 = s1.getRow(1);
		
		Cell cell = r2.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		if(stringCellValue.equals("praveena"))
		{
			cell.setCellValue("velmurugan");
		}
	
		w.write(o);
		
//		Cell createCell2 = r2.createCell(1);
//		createCell2.setCellValue("be cse");
//		w.write(o);
	
			
		
		
		
	}

}
