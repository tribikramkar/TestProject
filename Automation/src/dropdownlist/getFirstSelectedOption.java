package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/account/create");
	
		WebElement listbox=driver.findElement(By.xpath("//select[@type='select']"));
		Select sl=new Select(listbox);
		
		sl.selectByVisibleText("Lithuania ‪(+370)‬");
		sl.selectByValue("TN");
		sl.selectByVisibleText("United Kingdom ‪(+44)‬");
		WebElement firstselected=sl.getFirstSelectedOption();
		System.out.println(firstselected.getText());
	}

}
