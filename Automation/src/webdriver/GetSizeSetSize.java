package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSizeSetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(500, 400);
		driver.manage().window().setSize(d);
		driver.close();
	}

}
