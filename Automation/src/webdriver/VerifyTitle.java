package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://google.com");
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	
	}

}
