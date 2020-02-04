package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	

}
