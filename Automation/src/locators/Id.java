package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		//WebElement un=driver.findElement(By.id("email"));
	//	un.sendKeys("bikram");
	// OR
		driver.findElement(By.id("email")).sendKeys("tribikram");
		//driver.close();
	}

}
