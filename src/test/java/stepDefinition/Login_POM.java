package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login_POM {
//	public static WebDriver driver ;
//	@Given("Chrome Browser is open")
//	public void chrome_browser_is_open() 
//	{
//			System.out.println("inside - browser is open");
//			String projectPath = System.getProperty("user.dir");
//			System.out.println("Project Path : "+projectPath);
//					
//			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	}
//	@And("user is in the login Page")
//	public void user_is_in_the_login_page() 
//	{
//		driver.get("https://demo.actitime.com/login.do");
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String username , String password) throws InterruptedException 
//	{
//		LoginPage login = new LoginPage(driver);
//		
//		login.enteringUsername(username); 
//		login.enteringPassword(password);
//		
//		Thread.sleep(3000);
//
//	}
// 
//	@And("user click on LoginButton")
//	public void user_click_on_login_button() 
//	{
//		LoginPage login = new LoginPage(driver);
//		login.clickLoginButton();
//		
//	}
//	
//	@Then("user is on the homepage")
//	public void user_is_navigated_to_the_homepage() throws InterruptedException    
//	{
//		LoginPage login = new LoginPage(driver);
//		login.logoutisDisplayed();
//
//	}

}
