package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdarshGraminNidhi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://online.adarshgraminnidhi.com/Account/Login");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("sa-bero");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("JJkarr#4321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
