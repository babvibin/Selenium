package sample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://selenium.qabible.in/window-popup.php");
		
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String parentWindow = driver.getWindowHandle(); //current window handle
		System.out.println(parentWindow);
		Set<String> WindowHandlesss= driver.getWindowHandles() ; //all windows handle 
		
		for (String childWindow : WindowHandlesss) 
		{ 
		  if (!parentWindow.equals(childWindow)) 
		   { 
			  System.out.println(WindowHandlesss);
		    driver.switchTo().window(childWindow); 
		   }
		}
		
		driver.manage().window().maximize();		
		System.out.println("TEST");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='xod5an3']/child::div[@class='x78zum5 xdt5ytf xh8yej3']/descendant::input")).sendKeys("bbbb");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='x1c436fg']/child::div[@class='x78zum5 xdt5ytf xh8yej3']/descendant::input")).sendKeys("aaaa");	

	}

}
