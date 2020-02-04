package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username") 
	private WebElement txtUseName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	

	public WebElement getTxtUseName() {
		return txtUseName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
