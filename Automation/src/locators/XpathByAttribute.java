package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
	/*
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	*/
		
		driver.get("http://maxsopay.com/adminlogin.aspx");
		driver.findElement(By.xpath("//input[@name='txt_username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txt_userpassword']")).sendKeys("Max@pay");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// driver.close();
		
		
		
		
		
		
		
	}

}
/*
 xpath by group index (to avoid duplicacy)
 (//input[@type='text'])[1]--for 1st
 (//input[@type='text'])[1]--for 2nd
  
  Multiple attribute in a single expression
  //input//[@type='text'][@name='username ']
  
  
 */