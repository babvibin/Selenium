package sample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://selenium.qabible.in/window-popup.php");
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver ; 
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(file,new File("C:\\Users\\user\\Desktop\\Test Screenshot\\screenshot.png"));
		System.out.println("Completed");

		

	}

}
