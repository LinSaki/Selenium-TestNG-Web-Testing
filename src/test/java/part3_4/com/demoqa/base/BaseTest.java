package part3_4.com.demoqa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;

public class BaseTest {
	private WebDriver driver;
	protected BasePage basePage; // protected ensures it can be accessed within the same package and its subclasses even in other packages
	protected HomePage homePage;
	private String DEMOQA_URL = "https://demoqa.com/";
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void loadApplication() { //load app with driver.get method
		driver.get(DEMOQA_URL);
		basePage = new BasePage();
		basePage.setDriver(driver);
	}
	
}
