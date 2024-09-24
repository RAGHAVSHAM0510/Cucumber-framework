package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.AdminPage;
import io.cucumber.java.en.When;

public class AdminPageStepsTest extends BaseClass {
	private AdminPage adminPage;

	@When("user is on admin page validate url")
	public void user_is_on_admin_page_validate_url() {
		adminPage = new AdminPage();
		String actualUrl = adminPage.clickOnAdminLink();

		Assert.assertEquals(actualUrl.contains("admin"), true);
	}

	@When("user click on add button in admin page")
	public void user_click_on_add_button_in_admin_page() {
		adminPage.clickOnAdddbutton();
	}

	@When("user select user role and enter employee name and user select the status")
	public void user_select_user_role_and_enter_employee_name_and_user_select_the_status() {
		adminPage.userSelectUserRoleAndEnterEmployeeNameAndUserSelectStatus("Rohit Shinde");
	}

	@When("user enter username and password and confirm password")
	public void user_enter_username_and_password_and_confirm_password() {
		adminPage.enterUsernameAndPasswordAndConfirmPassword("rohit@gmail.com", "Rohit@123", "Rohit@123");
	}

	@When("user click on save button admin page")
	public void user_click_on_save_button_admin_page() throws InterruptedException {
		adminPage.clickOnSavebutton();

		Thread.sleep(8000);

		getDriver().quit();
	}

}
