package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sapient {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//*[@id='nav-xshop-container']//a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			//System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("innerText"));
		}
		driver.close();
	}

}
