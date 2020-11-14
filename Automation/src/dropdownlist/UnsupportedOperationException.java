package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UnsupportedOperationException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/account/create");
	
		WebElement listbox=driver.findElement(By.xpath("//select[@type='select']"));
		Select sl=new Select(listbox);
	
		
        sl.selectByVisibleText("Lithuania ‪(+370)‬");
        Thread.sleep(2000);
        sl.selectByIndex(5);
        Thread.sleep(2000); 
		sl.selectByValue("US");
		sl.deselectAll();
	}

}
