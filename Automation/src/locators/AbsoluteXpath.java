package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com"); 
		//create small html and try
		// /html/body/input (exp)
	}

}
