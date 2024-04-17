package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Page1 {

	WebDriver driver;
	public void page1(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver=driver;
	}
	By homeLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item active']/a");
	By inputFormLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][1]/a");
	By datePickersLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][2]/a");
	By tableLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][3]/a");
	By progressBarsLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][4]/a");
	By alertsAndModalsLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][5]/a");
	By listBoxLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][6]/a");
	By othersLINK=By.xpath("//div[@id='collapsibleNavbar']/child::ul[@class='navbar-nav']/child::li[@class='nav-item'][7]/a");

	public void clickHome()
	{
	driver.findElement(homeLINK).click();	
	}
	public void clickInputForm()
	{
		driver.findElement(inputFormLINK).click();
	}
	
}
