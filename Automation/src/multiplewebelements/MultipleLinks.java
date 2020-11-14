package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/tribikramkar/JARS/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.javatpoint.com/");
		List <WebElement> link=driver.findElements(By.xpath("//div/ul/li/a"));
		//List <WebElement> link=driver.findElements(By.xpath("//a[@href='php-tutorial']"));

		System.out.println(link.size());
		for(int i=0;i<link.size();i++) {
			
			System.out.println(link.get(i).getText());
		}
			for(int j=0;j<link.size();j++) {
				System.out.println(link.get(j).getAttribute("href"));
			}
		
	}

}
