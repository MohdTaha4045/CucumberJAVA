package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "logoutLink") 
	WebElement logoutButton;
	
	@FindBy(xpath = "//a[@class='content reports']") 
	WebElement reports;
	
	@FindBy(xpath = "//input[@id='SubmitTTButton']") 
	WebElement saveChanges;
	
	public void logoutisDisplayed()
	{		
		logoutButton.isDisplayed();
	}

	public void reportsisDisplayed()
	{		
		reports.isDisplayed();
	}
	
	public void saveChangesisDisplayed()
	{		
		saveChanges.isDisplayed();
	}

}
