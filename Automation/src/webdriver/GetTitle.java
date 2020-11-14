package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		String title=driver.getTitle();		
		System.out.println(title);
		
		//OR
			
		System.out.println(driver.getTitle());
	}

}
