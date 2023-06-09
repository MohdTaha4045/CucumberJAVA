     package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert; 

import io.cucumber.java.en.*;

public class LoginSteps 
{
//	WebDriver driver = null ;
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	  
//		String projectPath = System.getProperty("user.dir");
//				
//		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.get("https://demo.actitime.com/login.do");
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//	    System.out.println("inside user_enters_username_and_password()");
//		 driver.findElement(By.id("username")).sendKeys("trainee");	   
//		driver.findElement(By.name("pwd")).sendKeys("trainee");
//	    
// 
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//	    System.out.println("inside click_on_login_button()");
//	    
//	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		   
//
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() throws InterruptedException    
//	{
//	    System.out.println("inside user_is_navigated_to_the_homepage() ");
//	    String expectedTitle ="actiTIME - Enter Time-Track";
//	   
//	   Thread.sleep(5000);
//	   String actualTitle = driver.getTitle();
//	   System.out.println("actualTitle : "+actualTitle);
//	     
//	   Assert.assertTrue(actualTitle.contains(expectedTitle));
//	   driver.quit();
//
//	}
//	

}
