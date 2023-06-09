package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageFactory.Homepage;
import pageFactory.LoginPF;

public class BackGround {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		
		}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		LoginPF login = new LoginPF(driver);
		
		login.enteringUsername("trainee");
		login.enteringPassword("trainee");
	}

	@When("click on login button")
	public void click_on_login_button() {
		LoginPF login = new LoginPF(driver);
		login.clickLoginButton();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {

		String expectedTitle ="actiTIME - Enter Time-Track";
		   
		   Thread.sleep(3000);
		   String actualTitle = driver.getTitle();
		   System.out.println("actualTitle : "+actualTitle);
		     
		   Assert.assertTrue(actualTitle.contains(expectedTitle));
	}

	@When("user click on save changes")
	public void user_click_on_save_changes() {
		Homepage homepage = new Homepage(driver);
		homepage.saveChangesisDisplayed();
	}

	@Then("save changes successful")
	public void save_changes_successful() {
		Homepage homepage = new Homepage(driver);
		homepage.saveChangesisDisplayed();
	}

	@When("user Click on Logout")
	public void user_click_on_logout() {
		Homepage homepage = new Homepage(driver);
		homepage.logoutisDisplayed();
	}

	@Then("user is navigated to the Login Page")
	public void user_is_navigated_to_the_login_page() {
		Homepage homepage = new Homepage(driver);
		homepage.logoutisDisplayed();
	}

}
