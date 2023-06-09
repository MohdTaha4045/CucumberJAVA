package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginDataDriven 
{
	WebDriver driver = null ;
	@Given("Chrome Browser is open")
	public void chrome_browser_is_open() 
	{
			System.out.println("inside - browser is open");
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project Path : "+projectPath);
					
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@And("user is in the login Page")
	public void user_is_in_the_login_page() 
	{
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username , String password) throws InterruptedException 
	{
		WebElement usr = driver.findElement(By.id("username"));	   
		WebElement pas = driver.findElement(By.name("pwd"));
		usr.sendKeys(username);
		pas.sendKeys(password);
		Thread.sleep(3000);

	}

	@And("user click on LoginButton")
	public void user_click_on_login_button() 
	{
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   
	}
	
	@Then("user is on the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException    
	{
	    System.out.println("inside user_is_navigated_to_the_homepage() ");
	    String expectedTitle ="actiTIME - Enter Time-Track";
	   
	   Thread.sleep(5000);
	   String actualTitle = driver.getTitle();
	   System.out.println("actualTitle : "+actualTitle);
	     
	   Assert.assertTrue(actualTitle.contains(expectedTitle));
	   driver.quit();

	}



}
