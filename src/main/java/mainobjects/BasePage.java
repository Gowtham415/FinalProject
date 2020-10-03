package mainobjects;

import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected JavascriptExecutor jsDriver;
	protected WebDriverWait driverWait;
	protected Actions action;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		jsDriver = (JavascriptExecutor)driver;
		driverWait = new WebDriverWait(driver, 25);
		action = new Actions(driver);
	}
	
	
	public void waitForPageToLoad() {
		driverWait.until(new Function<WebDriver,Boolean>(){

			public Boolean apply(WebDriver t) {
				return jsDriver.executeScript("return document.readyState").equals("complete");
			}
		}); 
	}
	
	
}
