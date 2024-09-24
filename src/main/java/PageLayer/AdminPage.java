package PageLayer;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class AdminPage extends BaseClass {

	@FindBy(xpath = "//span[text()= 'Admin']")
	private WebElement adminLink;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addButton;

	@FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	private WebElement userRoleDropDown;

	@FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div/descendant::span[text()='Admin']")
	private WebElement userRoleDropDownValues;

	@FindBy(xpath = "//label[text()='Status']/parent::div/following-sibling::div/descendant::div[@class='oxd-select-text-input']")
	private WebElement statusDropDown;

	@FindBy(xpath = "//label[text()='Status']/parent::div/following-sibling::div/descendant::span[text()='Enabled']")
	private WebElement statusEnbaledDropDownValues;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement firstNameAndLastName;

	@FindBy(xpath = "//label[text()='Username']/parent::div/following-sibling::div/child::input")
	private WebElement username1;

	@FindBy(xpath = "//label[text()='Password']/parent::div/following-sibling::div/child::input")
	private WebElement password1;

	@FindBy(xpath = "//label[text()='Confirm Password']/parent::div/following-sibling::div/child::input")
	private WebElement confirmPassword;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	public AdminPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String clickOnAdminLink() {
		adminLink.click();
		
		return getDriver().getCurrentUrl();
	}

	public void clickOnAdddbutton() {
		addButton.click();
	}

	public void userSelectUserRoleAndEnterEmployeeNameAndUserSelectStatus(String FirstName) {
		userRoleDropDown.click();
		userRoleDropDownValues.click();
		firstNameAndLastName.sendKeys(FirstName);
		statusDropDown.click();
		statusEnbaledDropDownValues.click();
	}

	public void enterUsernameAndPasswordAndConfirmPassword(String Username, String Password, String ConfirmPassword) {
		username1.sendKeys(Username);
		password1.sendKeys(Password);
		confirmPassword.sendKeys(ConfirmPassword);
	}

	public void clickOnSavebutton() {
		saveButton.click();
	}

}
