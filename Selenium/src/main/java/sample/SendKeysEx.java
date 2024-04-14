package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element=driver.findElement(By.id("single-input-field"));
		element.sendKeys("Hi...");
		
			
	//	element.sendKeys(Keys.TAB);
		
	//	driver.findElement(By.id("button-one")).click();
		driver.findElement(By.xpath("//button[contains(@id,'button-one')]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		driver.close();
		
	}

}
