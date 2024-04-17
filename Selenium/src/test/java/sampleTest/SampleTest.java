package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.HomePage;
import page.InputForm;
import page.InputFormDetails;


public class SampleTest {
	
	WebDriver driver;
	public static String URL="https://selenium.qabible.in/";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();		
	}
	
	HomePage HomePage;
	@Test(priority = 0)
	public void verifyClickInputForm()
	{
		HomePage=new HomePage(driver);
		HomePage.clickInputForm();
	}
	
	InputForm InputForm;
	@Test(priority = 1)
	public void verifyClickSimpleFormDemo()
	{
	InputForm=new InputForm(driver);
	InputForm.clickSimpleFormDemo();	
	}
	
	InputFormDetails InputFormDetails;
	@Test(priority = 2)
	public void verifyInputFormDetailsSingleInput()
	{
		InputFormDetails=new InputFormDetails(driver);
		InputFormDetails.enterMessage("Here is a Sample Text");
		InputFormDetails.showMessageButtonClick();
		String messageText=InputFormDetails.yourMessageTextVerify();
		System.out.println(messageText);
	}

}
