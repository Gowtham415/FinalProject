package mainobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private static Logger Log = Logger.getLogger(HomePage.class.getName());
	
	public String getTitle() {
		Log.info("Title of the Web Page is "+driver.getTitle());
		return driver.getTitle();
	}
	
	public void clickDepartments(){
		Log.info("Clicking on Departments tab");
		WebElement element = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Departments']")));
		jsDriver.executeScript("arguments[0].click()", element);
		waitForPageToLoad();
	}

}
