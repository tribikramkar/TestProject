package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		WebElement tn=driver.findElement(By.id("email"));
		System.out.println(tn.getTagName());
	}

}
