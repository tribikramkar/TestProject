package synchroniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	}

}
