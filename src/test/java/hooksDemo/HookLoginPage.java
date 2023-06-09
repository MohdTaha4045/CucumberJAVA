//package hooksDemo;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.*;
//import io.cucumber.java.en.*;
//
//public class HookLoginPage 
//{
//	WebDriver driver = null ;
//
//	@Before
//	public void browserSetup()
//	{
//			String projectPath = System.getProperty("user.dir");
//					
//			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			driver.get("https://demo.actitime.com/login.do");
//			System.out.println("Browser is launched");
//	}
//	
//	
//	@After
//	public void browserTearDown()
//	{
//		driver.quit();
//		System.out.println("Driver is closed");
//	}
//	
//	@BeforeStep
//	public void beforeEveryStep() 
//	{
//		System.out.println("Hello");
//	}
//	
//	@AfterStep
//	public void afterEveryStep() 
//	{
//		System.out.println("Bye Bye");
//	}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	    
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//
//	}
//
//	@When("click on login button")
//	public void click_on_login_button() {
//
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//	
//	}
//
//
//}
