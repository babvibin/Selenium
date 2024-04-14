package sample;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

public class JavascriptExecutorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://selenium.qabible.in/form-submit.php");
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver ;
		String value = "text"; 
		javascriptExecutor.executeScript("document.getElementById('validationCustom01').value='"+value+"'"); 
				
	//	javascriptExecutor.executeScript("window.open('', '_blank');"); 
	//	javascriptExecutor.executeScript("window.scrollBy(100, 0)"); 
	//	javascriptExecutor.executeScript("window.scrollBy(0, 100)"); 
	//	javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("TEST");

	}

}
