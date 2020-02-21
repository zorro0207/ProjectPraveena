package sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AUTO {
	public static void main(String[] args) throws IOException {
		File f1= new File("E:\\workspace\\sample1\\Testcase\\Book1.xlsx");
		FileInputStream fs= new FileInputStream(f1);
		Workbook w= new XSSFWorkbook(fs);
		Sheet s1 = w.getSheet("sheet1");
		
		for (int i = 0; i <s1.getPhysicalNumberOfRows() ; i++) {
			Row r = s1.getRow(i);
			System.out.println("----------------");
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if(cellType==1)
				{
					String stringCellValue = c.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if(cellType==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						Date dateCellValue = c.getDateCellValue();
						SimpleDateFormat sd= new SimpleDateFormat("MM/dd/yyyy");
				        String format = sd.format(dateCellValue);
				        
				      System.out.println(format);
				}
					else
					{
						double numericCellValue = c.getNumericCellValue();
						long l=(long) numericCellValue;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
						
					}
				
				
				
				
			}
			
		}
		}
	}
}

		
		
	


