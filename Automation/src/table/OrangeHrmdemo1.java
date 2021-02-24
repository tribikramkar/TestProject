package table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmdemo1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//b[text()=\"PIM\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Employee List\"]")).click();


		int r=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr")).size();
		System.out.println(r);
		
		int c=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th")).size();
		System.out.println(c);
		
		for(int i=1;i<r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/"
						+ "div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}
		
		driver.close();
	}

}
