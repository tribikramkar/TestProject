package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		WebElement list=driver.findElement(By.xpath("//a[.='Home & Living']"));
		Actions act=new Actions(driver);
		act.moveToElement(list).perform();
	}

}
