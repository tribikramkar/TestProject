package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();;
		driver.findElement(By.xpath("//option[@value='6']")).click();
		
		
	}

}
