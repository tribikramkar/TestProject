package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
	//	driver.findElement(By.linkText("Forgotten password?")).click();
	// OR	
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		System.out.println(link.getText());
		link.click();
		driver.close();

	}

}
