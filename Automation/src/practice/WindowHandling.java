package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String> win=new ArrayList<String>(windows);
		System.out.println(windows);
		for(int i=0;i<win.size();i++) {
			driver.switchTo().window(win.get(i));
			System.out.println(driver.getTitle());
				driver.close();
			
			
		}
		

	}

}
