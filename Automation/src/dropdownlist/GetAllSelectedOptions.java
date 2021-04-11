package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/account/create");
	
		WebElement listbox=driver.findElement(By.xpath("//select[@type='select']"));
		Select sl=new Select(listbox);
		
		sl.selectByVisibleText("Lithuania ‪(+370)‬");
		List<WebElement> list=sl.getAllSelectedOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}

}
//