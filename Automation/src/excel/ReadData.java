 package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadData {

	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		
		
		FileInputStream fis=new FileInputStream("./testdata/ir211wk12sample.xls");
		//XSSFWorkbook wb=new XSSFWorkbook(fis);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		Sheet s=wb.getSheet("SalesOrders");
		Row r=s.getRow(3);
		Cell c=r.getCell(3);
		System.out.println(c.getStringCellValue());
		String text=c.getStringCellValue();
		
		un.sendKeys(text);
		
		
	}

}
