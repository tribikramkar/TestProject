package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DranAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		WebElement source=driver.findElement(By.xpath("//span[text()='James Johns']"));
		WebElement target=driver.findElement(By.xpath("//ul[@class='dhx_widget dhx_list ']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		

	}

}
