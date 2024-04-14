package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationEx2 {

	@Test(priority = 3)
	public void testingA() {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.google.com/");
	//	driver.close();
	//	driver.quit();
		driver.get("https://en.wikipedia.org/");
		driver.quit();
	}
	
	@Test(priority = 0)
	public void testingB()
	{
	System.out.println("Test B");	
	}
	
	@Test(priority = -4)
	public void testingC()
	{
	System.out.println("Test C");	
	}
	
	@Test(priority = 1,invocationCount = 3)
	public void testingD()
	{
	System.out.println("Test D");	
	}
	
	@Test(priority = 7, enabled = false)
	public void testingE()
	{
	System.out.println("Test E");	
	}

}
