package testconfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import mainobjects.BasePage;
import mainobjects.FinalProjectObject;

public class ConfigurationClass{

	protected ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();
	public static WebDriver driver;
	public BasePage basePage;
	public FinalProjectObject AnnaUniv;
	
	public String BROWSER;
	
	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browserName) {
		this.BROWSER = browserName;
	}
	
	@BeforeMethod
	public void beforeMethod() {	
		if (BROWSER.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			threadLocalDriver.set(new ChromeDriver());
		}
		driver = threadLocalDriver.get();
		driver.manage().window().maximize();
		AnnaUniv = new FinalProjectObject(driver);
		driver.get("https://annauniv.edu/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@AfterTest
	public void afterTest() {
		
	}

}
