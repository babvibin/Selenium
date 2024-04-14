package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.findElement(By.id("gridCheck")).click();
		
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Alert alert1= driver.switchTo().alert(); 
		String alertext=alert1.getText(); 
		System.out.println(alertext);
		alert1.accept(); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		Alert alert2= driver.switchTo().alert(); 
		String alertext2=alert2.getText(); 
		System.out.println(alertext2);
		alert2.accept(); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		Alert alert3= driver.switchTo().alert(); 
		String alertext3=alert3.getText(); 
		System.out.println(alertext3);
		alert1.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert4= driver.switchTo().alert(); 
		String alertext4=alert4.getText(); 
		System.out.println(alertext4);
		alert4.sendKeys(""); 
		Thread.sleep(3000);
		alert4.sendKeys("Testing..."); 
		Thread.sleep(3000);			
		alert4.accept(); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert5= driver.switchTo().alert(); 
		String alertext5=alert5.getText(); 
		System.out.println(alertext5);
		alert5.sendKeys("Testing..."); 		
		alert5.dismiss();
		Thread.sleep(3000);		
		
		
		//table[@id='dtBasicExample']/descendant::td[13]
		//table[@id='dtBasicExample']/descendant::td[18]
		
		
		

	}

}
