package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.When;

public class PIMPageStepsTest extends BaseClass{
	private PIMPage pimPage;

	@When("user is on pim page and validate url")
	public void user_is_on_pim_page_and_validate_url() {
		pimPage = new PIMPage();
		String actualURl = pimPage.clickOnPimLink();

		Assert.assertEquals(actualURl.contains("pim"), true);
	}

	@When("user click on add employee")
	public void user_click_on_add_employee() {
		pimPage.clickOnAddEmployee();
	}

	@When("user enter firstname and last name")
	public void user_enter_firstname_and_last_name() {
		pimPage.enterFirstNameAndLastName("Rohit", "Shinde");
	}

	@When("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		pimPage.clickOnSaveButton();
		
		
		Thread.sleep(8000);
		
		getDriver().quit();
		
		
		
		
		
		
		
		
		
	}
}
