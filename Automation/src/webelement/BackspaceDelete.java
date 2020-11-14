package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackspaceDelete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		un.sendKeys("tribikram");
		Thread.sleep(2000);
		un.sendKeys(Keys.COMMAND,"a");
		un.sendKeys(Keys.BACK_SPACE);
	}

}
