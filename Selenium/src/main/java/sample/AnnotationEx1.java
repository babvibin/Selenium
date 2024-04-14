package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AnnotationEx1
{
	@Test(priority = 0, retryAnalyzer = RetryAnalyzer.class)
	public void testingA() {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Wikipedia, the free encyclopediaa");
		System.out.println("Hard Assert: Executions stops when a Hard Assert Fails. Page title is compared & it is correct");	
		
		SoftAssert softAssert = new SoftAssert(); 
		softAssert.assertEquals(pageTitle, "Wikipedia, the free encyclopediaa");
		System.out.println("Soft Assert: Executions continues even  when a Soft Assert Fails. Page title is compared & it is wrong");
		driver.quit();
			
	}
	
	@Parameters({"browser"})
	@Test
	public void testingB(String browserName)
	{
	System.out.println("Test B");
	System.out.println(browserName);	
	
	switch(browserName)
	{
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		WebDriver driverFirefox=new FirefoxDriver(); 
		driverFirefox.manage().window().maximize();
		driverFirefox.get("https://en.wikipedia.org/");
		driverFirefox.quit();
		break;	
	case "chrome":
		WebDriverManager.chromedriver().setup();
		WebDriver driverChrome=new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.get("https://en.wikipedia.org/");
		driverChrome.quit();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		WebDriver driverEdge=new EdgeDriver();
		driverEdge.manage().window().maximize();
		driverEdge.get("https://en.wikipedia.org/");
		driverEdge.quit();
		break;
		default:
			System.out.println("Browser is not available");		
	}	
	}	
		
	@Test(priority = -4)
	public void testingC()
	{
	System.out.println("Test C");	
	
	
	}
	
	@Test(groups = {"smoke"})
	public void testingD()
	{
	System.out.println("Test D");	
	}
	
	@Test(priority = 1,invocationCount = 3, groups = {"regression"})
		public void testingE()
	{
	System.out.println("Test E");	
	}
	
	
	@Test(dataProvider = "sample") 
	public void samplePrintout(String key,String value)
	{ 
	System.out.println("Key=" + key +" , "+ "value="+value ); 
	} 
	@DataProvider(name="sample") 
	public Object[][] sampleKeyValuePair()
	{ 
	return new Object[][] 
	{ 
	{"x","1"}, 
	{"y","2"} 
	} ; 
	
	}
}
