package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> tableRowsName=driver.findElements(By.xpath("//table[@id='dtBasicExample']/child::tbody/descendant::tr/child::td[1]"));

		int rowNumber=1;
		for(WebElement rowFinder : tableRowsName)
		{
			if(rowFinder.getText().equals("Ashton Cox"))
			{
				System.out.println("Row number is: " +rowNumber);	
				break;
			}
			rowNumber++;
			
		}
		rowNumber--;
		//table[@id='dtBasicExample']/child::tbody/descendant::tr/child::td[1]/following-sibling::td[1]
		
	//	List<WebElement> tableRowPosition=driver.findElements(By.xpath("//table[@id='dtBasicExample']/child::tbody/descendant::tr/child::td[2]")); \\this also works
		List<WebElement> tableRowPosition=driver.findElements(By.xpath("//table[@id='dtBasicExample']/child::tbody/descendant::tr/child::td["+rowNumber+"]"));
		System.out.println(tableRowPosition.get(2).getText());
	System.out.println(tableRowPosition.get(rowNumber).getText());
				
		if(tableRowPosition.get(2).getText().equals("Junior Technical Author"))
		{
			System.out.println("Position is correct");			
		}
		else 
		{
			System.out.println("Position is wrong");	
		}
		
		
		List<WebElement> tableRowOffice=driver.findElements(By.xpath("//table[@id='dtBasicExample']/child::tbody/descendant::tr/child::td[3]"));
		System.out.println(tableRowOffice.get(2).getText());
		if(tableRowOffice.get(2).getText().equals("San Francisco"))
		{
			System.out.println("Office is correct");			
		}
		else 
		{
			System.out.println("Office is wrong");	
		}		
		
		
		
		
	}
}
