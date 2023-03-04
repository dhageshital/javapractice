


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class scrrenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("F:\\screen and excel\\SCREENSHOT\\pqrs.bmp");
		
Files.copy(s,d);
	}

}
