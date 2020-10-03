package mainobjects;

import org.openqa.selenium.WebDriver;

public class FinalProjectObject extends BasePage {
	
	public HomePage HOMEPAGE;
	public DepartmentsPage DEPARTMENTSPAGE;

	public FinalProjectObject(WebDriver driver) {
		super(driver);
		this.HOMEPAGE = new HomePage(driver);
		this.DEPARTMENTSPAGE = new DepartmentsPage(driver);
	}

	public  FinalProjectObject selenium() {
		return this;
	}
	
	
}
