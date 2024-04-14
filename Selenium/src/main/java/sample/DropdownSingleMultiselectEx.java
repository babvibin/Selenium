package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSingleMultiselectEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
				
		Select selectColour = new Select(driver.findElement(By.id("single-input-field"))); 
		selectColour.selectByValue("Red");
		selectColour.selectByVisibleText("Red");
		Thread.sleep(3000);
		selectColour.selectByIndex(2);

		Select multiColourSelect = new Select(driver.findElement(By.id("multi-select-field"))); 
		multiColourSelect.selectByIndex(2);
		multiColourSelect.selectByIndex(1);
		
		
		
		
		
	//	driver.close();
		

	}

}
