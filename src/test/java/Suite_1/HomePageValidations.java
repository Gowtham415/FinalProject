package Suite_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import testconfigs.ConfigurationClass;

public class HomePageValidations extends ConfigurationClass {

	@Test
	public void getTitleOfHomePage() {
		Assert.assertEquals(fpo.selenium().HOMEPAGE.getTitle(), "Home - Anna University", "Title is not correct!");
	}

	@Test
	public void getTitleOfdepartmentsPage() throws InterruptedException {
		fpo.selenium().HOMEPAGE.clickDepartments();
		String actual = fpo.selenium().DEPARTMENTSPAGE.getTitle();
		Assert.assertEquals(actual, "Anna University - Departments", "Title did not match");
	}
}
