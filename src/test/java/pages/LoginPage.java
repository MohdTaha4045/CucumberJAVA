package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  {
 
	public WebDriver driver;

	 
//	WebElement usernameTextField = driver.findElement(By.xpath("//input[@id='username']"));
//	WebElement passwordTextField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//	WebElement keepMeLoggedIn = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
//	WebElement login = driver.findElement(By.xpath("//div[normalize-space()='Login']"));
//	WebElement forgotYourPassword = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']"));
//	WebElement actiTIME2020Online = driver.findElement(By.xpath("//nobr[normalize-space()='actiTIME 2020 Online']"));
//	WebElement actiTIMEInc = driver.findElement(By.xpath("//a[normalize-space()='actiTIME Inc.']"));
//	WebElement logoutButton = driver.findElement(By.id("logoutLink"));
//	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	public void enteringUsername(String username)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}
	
	public void enteringPassword(String password)
	{
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}
	
	public void checkKeepMeLoggedIn()
	{
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
	}

	public void clickLoginButton()
	{
		driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
	}
	
	/*public void loginValidUser(String username,String password) 
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		login.click();	
	}*/
	
	public void logoutisDisplayed()
	{		
		WebElement logoutButton = driver.findElement(By.id("logoutLink"));

		logoutButton.isDisplayed();
	}
}
