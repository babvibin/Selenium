package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateURLEx_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.google.com/");
	//	driver.close();
	//	driver.quit();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.quit();

	}

}
