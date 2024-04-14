package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitImplicitExplicitFluentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("validationCustom01")));
		
		
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.pollingEvery(Duration.ofSeconds(3));
		fluentWait.withTimeout(Duration.ofSeconds(3));
		fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("validationCustom01")));
		
		
		

	}

}
