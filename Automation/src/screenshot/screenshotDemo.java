package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotDemo {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/tribikramkar/JARS/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		
		takeScreenshot("test");
		driver.close();
	}

	public static void takeScreenshot(String filename) throws IOException {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("/Users/tribikramkar/eclipse-workspace/Automation/src/screenshot/screenshots"+filename+".jpg"));
	}
}
