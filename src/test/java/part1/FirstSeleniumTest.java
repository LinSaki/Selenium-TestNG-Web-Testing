package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	WebDriver driver; //control the browser and help find elements
	
	@BeforeClass //a way for us to run the code BEFORE the class
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass //cleans up our tests, operates like a POST condition
	public void tearDown() {
		//driver.quit(); //closes EVERY window and quits the driver - STANDARD
		//driver.close();// closes the CURRENT window
	}
	
	@Test //FIND element, THEN perform action
	public void testLoggingIntoApplication() throws InterruptedException {
		Thread.sleep(2000); // equals to 2seconds
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		//three ways to find an element
		var password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click(); //no object reference
	}
}
