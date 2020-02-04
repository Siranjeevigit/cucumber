package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	BookingConfirmation(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}

	

	
	}

	
	

