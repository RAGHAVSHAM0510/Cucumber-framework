package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStepsTest extends BaseClass {
	private HomePage homePage;

	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		homePage = new HomePage();
		Assert.assertEquals(homePage.getTitle(), "OrangeHRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		Assert.assertEquals(homePage.getCurrentUrl().contains("orange"), true);
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		Assert.assertEquals(homePage.checkLogoDisplayedStatus(), true);
	}
}
