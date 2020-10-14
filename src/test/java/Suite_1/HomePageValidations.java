package Suite_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import testconfigs.ConfigurationClass;

public class HomePageValidations extends ConfigurationClass {

	@Test
	public void getTitleOfHomePage() {
		Assert.assertEquals(AnnaUniv.selenium().HOMEPAGE.getTitle(), "Home - Anna University", "Title is not correct!");
	}

	@Test()
	public void getTitleOfdepartmentsPage() throws InterruptedException {
		AnnaUniv.selenium().HOMEPAGE.clickDepartments();
		String actual = AnnaUniv.selenium().DEPARTMENTSPAGE.getTitle();
		Assert.assertEquals(actual, "Anna University - Departments", "Title did not match");
	}
}
