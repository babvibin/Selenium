package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEx {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		/*
		 WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]")); 
		 fileInput.sendKeys("C:\\Programming\\Obsqura\\SeleniumTrainingDemo\\target\\screenshot.png"); 
		 driver.findElement(By.id("file-submit")).click();
		 */		
		
		driver.get("https://www.adobe.com/acrobat/online/jpg-to-pdf.html?sdid=HVQ7WXVK&mv=search&mv2=paidsearch&ef_id=10b6c7a6743c1ff49d99a1b4ef38b282:G:s&s_kwcid=AL!3085!10!78958861408779!78959221730909&mv=search");
		
		String filePath = "C:\\Users\\user\\Desktop\\Assignment 0"; 
		Robot robot = new Robot(); 
		System.out.println("1");
		StringSelection stringSelection = new StringSelection(filePath); 
		System.out.println("2");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null); 
		System.out.println("3");
		driver.findElement(By.xpath("//div[@class='FileUpload__chooseButtonContainer___FqbaR']")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println("4");
		robot.keyPress(KeyEvent.VK_CONTROL); 
		System.out.println("5");
		robot.keyPress(KeyEvent.VK_V); 
		System.out.println("6");
		robot.keyRelease(KeyEvent.VK_V); 
		System.out.println("7");
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		System.out.println("8");
		robot.keyPress(KeyEvent.VK_ENTER); 
		System.out.println("9");
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("10");
		
		// http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload

	}

}
