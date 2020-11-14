package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;import javax.lang.model.type.WildcardType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException, AWTException {
	/*	System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
	*/	
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
	 /*   driver.get("https://facebook.com");
	    
	    WebElement t=  driver.findElement(By.tagName("html"));
	    System.out.println(t.getTagName());
	    t.sendKeys(Keys.COMMAND,"t");
	    Thread.sleep(2000);
		driver.get("https://google.com");
	*/
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		
	}
		

}
