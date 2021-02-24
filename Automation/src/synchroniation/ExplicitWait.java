package synchroniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		/*	System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver(); */
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.titleContains("actiTime"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container_tasks']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='container_tasks']")));
	//	WebElement el=driver.findElement(By.xpath("//a[@class='content selected tasks']"));
	//	wait.until(ExpectedConditions.elementToBeClickable(el));
		
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	}

}
