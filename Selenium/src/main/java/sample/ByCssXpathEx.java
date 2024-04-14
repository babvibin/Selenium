package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssXpathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/");
		
		driver.findElement(By.className("cdx-text-input__input")).sendKeys("selenium");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input.cdx-text-input__input")).sendKeys("TEST");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("John");
	    Thread.sleep(3000);
	    
		driver.findElement(By.xpath("//input[contains(@class,'loginText mw-userlogin-username cdx-text-input__input')]")).sendKeys(" DOE");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[contains(@id,'wpName1') and @name='wpName']")).sendKeys(" Martin");
	    Thread.sleep(3000);
	    
	 
	    driver.findElement(By.xpath("//label[text()='Keep me logged in (for up to one year)']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    Thread.sleep(3000);
	    
	    
	 //   WebElement button1 =driver.findElement(By.xpath("//button[text()='Log in']"));
	//    button1.click();
	    
	    
	    
	    
	    //button[text()='Log in']
	    
	    //input[contains(@id,'wpName1') and @name='wpName']
	    
	    //input[contains(@class,'loginText mw-userlogin-username cdx-text-input__input')]
	    
	    
		
		//input[@placeholder='Enter your username']
			
	//	WebElement button1 = driver.findElement(By.cssSelector("input[data-ved=['0ahUKEwj019u94YyFAxUDTmwGHWSgBccQ4dUDCA0']"));
	//	button2.click();
		Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("div.CvDJxb")).sendKeys("TESTING");
	//	Thread.sleep(5000);
		
		driver.close();

	}

}
