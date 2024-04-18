package page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormDetailsPageFactory {
	
	WebDriver driver;
	public InputFormDetailsPageFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "single-input-field")
	WebElement enterMessage;
	
	@FindBy(xpath = "//button[contains(@id,'button-one')]")
	WebElement showMessageButton;
	
	@FindBy(id = "message-one")
	WebElement yourMessageText;
	
	@FindBy(id = "value-a")
	WebElement valueATextBox;
	
	@FindBy(id = "value-b")
	WebElement valueBTextBox;	
	
	@FindBy(id = "button-two")
	WebElement getTotalButton;
	
	@FindBy(id = "message-two")
	WebElement totalText;
	
	public void enterMessage(String message)
	{
		enterMessage.sendKeys(message);
	}
	

}
