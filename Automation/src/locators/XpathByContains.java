package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContains {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[contains(text(),'Forg')]")).click();//to click on forgotten account
		driver.close();
		
	}

}

/*
If value is in &nbsp we can use this 
this is the another use of contains using attribute

//tagname(contains(@attributename,'attributevalue'))
*/