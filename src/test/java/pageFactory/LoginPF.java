package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF 
{
	WebDriver driver;
	
	public LoginPF(WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='username']") 
	WebElement usernamePF;
	
	@FindBy(xpath = "//input[@placeholder='Password']") 
	WebElement passwordPF;
	
	@FindBy(xpath = "//div[normalize-space()='Login']") 
	WebElement login;
	 
	
	
	public void enteringUsername(String username)
	{
		usernamePF.sendKeys(username);
	}
	
	
	public void enteringPassword(String password)
	{
		passwordPF.sendKeys(password);
	}
	
	
	public void clickLoginButton()
	{
		login.click();
	}
	
	
}
