package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {
	public static void main(String[] args) throws Exception {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Bhubaneswar");;
	
		
	}

}
