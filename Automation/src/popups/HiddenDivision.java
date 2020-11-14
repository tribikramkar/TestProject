 package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com");
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]")).click();

	}

}
