package mainobjects;

import org.openqa.selenium.WebDriver;

public class DepartmentsPage extends BasePage{

	public DepartmentsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle() {
//		driverWait.until(ExpectedConditions.titleContains("depart"));
			return driver.getTitle();
	}
}
