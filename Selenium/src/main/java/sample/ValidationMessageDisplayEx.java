package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMessageDisplayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.findElement(By.id("validationCustom01")).sendKeys("John");
		driver.findElement(By.id("validationCustom02")).sendKeys("Doe");
		driver.findElement(By.id("validationCustomUsername")).sendKeys("jdoe");
		driver.findElement(By.id("validationCustom03")).sendKeys("Ashburn");
		driver.findElement(By.id("validationCustom04")).sendKeys("Virgenia");
		driver.findElement(By.id("validationCustom05")).sendKeys("20101");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		try {
			System.out.println("Is Validation Message Displayed: " +driver.findElement(By.xpath("//label[contains(@class,'form-check-label')]/following-sibling::div")).isDisplayed());	
		}
		catch(Exception e)
		{
			System.out.println("Exception is:  " +e);
		}
		driver.quit();
		
	//	String validationMessage=driver.findElement(By.xpath("//label[contains(@class,'form-check-label')]/following-sibling::div")).getText();
	//	System.out.println("Is Actual validation message = Expected validation message: " +validationMessage.equals("You must agree before submitting."));
		
	}

}
