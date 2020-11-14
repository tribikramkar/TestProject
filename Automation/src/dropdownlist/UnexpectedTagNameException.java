package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagNameException {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		WebElement list=driver.findElement(By.xpath("//label[@class='ng-tns-c11-6 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']"));
		Select sl=new Select(list);
		System.out.println(sl.isMultiple());
		sl.selectByValue("1A");
	
	}

}
