package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Bikram");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		driver.close();
	}

}
