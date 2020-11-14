package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		driver.navigate().to("https://flipkart.com");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();

	}

}
