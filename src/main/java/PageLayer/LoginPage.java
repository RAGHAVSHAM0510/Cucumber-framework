package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text() = ' Login ']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void enterUsernameAndPassword(String Username, String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
}
