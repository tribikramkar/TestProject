package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
	/*	driver.get("https://facebook.com");
		WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		un.sendKeys("tribikram");
		System.out.println(un.getAttribute("value"));
	*/
		
		driver.get("https://www.qspiders.com/contact");
		WebElement m=driver.findElement(By.xpath("//span[text()='+916364884448']"));
		System.out.println(m.getText());
	}

}
