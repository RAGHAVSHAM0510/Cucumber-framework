package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='client brand banner']")
	private WebElement logo;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public boolean checkLogoDisplayedStatus() {
		return logo.isDisplayed();
	}

	public String getTitle()
	{
		return getDriver().getTitle();
	}
	
	public String getCurrentUrl()
	{
		return getDriver().getCurrentUrl();
	}
}
