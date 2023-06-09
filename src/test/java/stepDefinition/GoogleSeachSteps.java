package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSeachSteps {
	
	WebDriver driver = null ;
	
	@Given("browser is open")
	public void browser_is_open() 
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user is on google page")
	public void user_is_on_google_page() 
	{
		driver.get("https://www.google.com/"); 	
	}

	@When("user enters a text in search text field")
	public void user_enters_a_text_in_search_text_field() 
	{
		driver.findElement(By.id("APjFqb")).sendKeys("joker");
	}

	@And("hit enter")
	public void hit_enter() 
	{
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() 
	{
		driver.findElement(By.xpath("//h3[text()='Joker (2019 film)']")).click();
	}

}
