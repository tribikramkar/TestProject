package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();(for create new account)

	}

}
