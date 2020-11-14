package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedEnabledSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(5000);
		WebElement femaleradiobutton=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		System.out.println(femaleradiobutton.isDisplayed());//true
		System.out.println(femaleradiobutton.isEnabled());//true
		System.out.println(femaleradiobutton.isSelected());//false because button not clicked
		femaleradiobutton.click();
		System.out.println(femaleradiobutton.isSelected());//true after click 
	}

}
