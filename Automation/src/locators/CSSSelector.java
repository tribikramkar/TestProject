package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		/*
	    driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("input[aria-label='Email address or phone number']")).sendKeys("Kanha");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("hi");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		*/
		
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.cssSelector("a[id='createacc']")).click();
		
		driver.close();
	}

}
