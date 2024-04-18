package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page2.InputFormDetailsPageFactory;

public class SampleTestPageFactory {
	
	WebDriver driver;
	public static String URL="https://selenium.qabible.in/simple-form-demo.php";
	InputFormDetailsPageFactory InputFormDetailsPageFactory;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/main/resources/chromedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();		
	}	
	
	@Test
	public void inputText()
	{
		InputFormDetailsPageFactory=new InputFormDetailsPageFactory(driver);
		InputFormDetailsPageFactory.enterMessage("Page Factory Test Text");		
	}	

}
