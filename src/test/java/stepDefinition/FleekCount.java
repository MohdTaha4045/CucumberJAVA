package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FleekCount 
{

		public static void main(String[] args) throws InterruptedException 
		{
				int total = 0 ;
				String projectPath = System.getProperty("user.dir");

				System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("https://www.google.com/");
				driver.findElement(By.id("APjFqb")).sendKeys("Fleek It Solutions");
				driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
				driver.findElement(By.xpath("//h3[text()='Fleek IT Solutions - Top Software Testing Company']")).click();
				
				driver.findElement(By.xpath("//span[text()='Blogs']")).click();
				
				for(int i = 1 ; i <9 ; i++)
				{	
					//new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//li[@class='next']"))));
			
					
					Thread.sleep(2000);
					int Number = driver.findElements(By.xpath("//div[@class='post_image']")).size();
					System.out.println(i+" page count : "+Number);
					total = total + Number;
					
					driver.findElement(By.xpath("//li[@class='next']")).click();
					
				}	
				System.out.println("Total no. of count "+total);
				driver.quit();
			}
	


}
