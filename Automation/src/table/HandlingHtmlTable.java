package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHtmlTable {

	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		int r=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/"
				+ "div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]"
				+ "/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
		System.out.println(r);
		
		int c=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/"
				+ "div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/thead[1]/tr/th")).size();
		System.out.println(c);
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/"
						+ "div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}
	}
	
	
}

