package sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	static WebDriver driver;
	static Select s;
	
	
	public static void browserLaunch() {
		try
		{System.setProperty("webdriver.chrome.driver","E:\\workspace\\sample1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser launched");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("browser not launched");
		}
		
		
		
		}
	public static void loadUrl(String value) {
		try {
       driver.get(value);
       System.out.println("url loaded successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("url not loaded");
		}
		
	}
	public static void windowmax() {
		try
		{
			driver.manage().window().maximize();
			System.out.println("window maxmize done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("window didnt maximize");
		}

	}
	public static void getAttribute(WebElement ele, String value) {
		try
		{
			ele.getAttribute(value);
			System.out.println("printed attribute value");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("error in printing attribute value");
		}

		
	}
	
	public static void fill(WebElement ele, String value) {
		
		try
		{
			ele.sendKeys(value);
			System.out.println("value passed using sendkeys");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("value not passed");
		}

		
	}	
		
		
		
public static void click(WebElement ele) {
		
		try
		{
			ele.click();
			System.out.println("click success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("click fail");
			
		}

		
	}		
		

public static String getfromExcel(int r,int c) throws IOException {
	File f1= new File("E:\\workspace\\sample1\\Testcase\\naukri.xlsx");
	FileInputStream fs= new FileInputStream(f1);
	Workbook w= new XSSFWorkbook(fs);
	Sheet sheet = w.getSheet("sheet1");
	Row row = sheet.getRow(r);
	Cell cell = row.getCell(c);
	String value=null;
	int cellType = cell.getCellType();
	if(cellType==1)
	{
		value=cell.getStringCellValue();
		
	}
	else if(cellType==0)
	{
		if(DateUtil.isCellDateFormatted(cell))
		{
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat sd= new SimpleDateFormat("MM/dd/yyyy");
			value = sd.format(dateCellValue);
			
		}
		else
		{
			double numericCellValue = cell.getNumericCellValue();
			long l=(long) numericCellValue;
			value=String.valueOf(l);
			
		}
		
	}
	


return value;


}		
		
public static void selectByVisibletext(WebElement ele, int r,int c){
	
	try
	{
		s= new Select(ele);
		s.selectByValue(getfromExcel(r,c));
		
		System.out.println("value selected in dropdown using select from excel");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("value not selected in dropdown using select from excel");
	}

	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	

}
