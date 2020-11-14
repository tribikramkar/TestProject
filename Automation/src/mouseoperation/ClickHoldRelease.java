package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldRelease {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Blog");
		WebElement tgt=driver.findElement(By.xpath("//div[contains(text(),'Blogger')]"));
		WebElement src=driver.findElement(By.xpath("//i[contains(text(),'to maintain')]"));

		Actions act=new Actions(driver);
		act.clickAndHold(tgt).perform();
		Thread.sleep(2000);
		act.release(src).perform();
		
	}

}
