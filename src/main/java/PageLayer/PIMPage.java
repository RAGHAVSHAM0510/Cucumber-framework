package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()= 'PIM']")
	private WebElement pimLink;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addButton;

	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	public PIMPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String clickOnPimLink() {
		pimLink.click();
		return getDriver().getCurrentUrl();
		
	}

	public void clickOnAddEmployee() {
		addButton.click();
	}

	public void enterFirstNameAndLastName(String FirstName, String LastName) {
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);

	}

	public void clickOnSaveButton() {
		saveButton.click();
	}

}
