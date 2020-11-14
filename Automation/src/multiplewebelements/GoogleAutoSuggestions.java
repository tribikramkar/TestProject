 package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		Thread.sleep(5000);
		List <WebElement> sugg=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(sugg.size());
	/*	for(int i=0;i<sugg.size();i++) {
			System.out.println(sugg.get(i).getText());
		}
		sugg.get(2).click();
	*/
		for(int i=0;i<sugg.size();i++) {
			if (sugg.get(i).getText().equalsIgnoreCase("selenium interview questions")) {
				sugg.get(i).click();
				break;
			}
		}
		
		
		
	}

}
