package org.page;

import org.openqa.selenium.WebDriver;

public class Hotel {
	public static void main(String[] args) throws Throwable {
		BaseClass base = new BaseClass();
		WebDriver driver = base.getDriver();
		base.loadUrl("https://adactin.com/HotelApp/index.php");
		
		LoginPage page = new LoginPage();
		base.type(page.getTxtUseName(), "Siranjeevi1990");
		base.type(page.getTxtPassword(), "Something1990");
		base.btnClick(page.getLoginButton());
		
		SearchHotelPage page1 = new SearchHotelPage();
		base.select(page1.getLoacation(), "London");
		base.select(page1.getHotel(), "Hotel Creek");
		base.select(page1.getRoom(), "Double");
		base.select(page1.getRoomNumber(), "2 - Two");
		base.type(page1.getInDate(), "26/01/2020");
		base.type(page1.getOutDate(), "27/01/2020");
		base.select(page1.getAdultRoom(), "2 - Two");
		base.select(page1.getChildRoom(), "2 - Two");
		base.btnClick(page1.getSubmit());
		
		SelectHotel page2 = new SelectHotel();
		base.btnClick(page2.getRadioButton());
		base.btnClick(page2.getContinueButton());
		
		BookHotelPage page3 = new BookHotelPage();
		base.type(page3.getFirstName(),"siranjeevi");
		base.type(page3.getLastName(), "Gv");
		base.type(page3.getAddress(), "233 Anna Nagar");
		base.type(page3.getCardNo(), "4280902330462748");
		base.select(page3.getCardType(), "Master Card");
		base.select(page3.getMonth(), "April");
		base.select(page3.getYear(), "2022");
		base.type(page3.getCv(), "736");
		base.btnClick(page3.getBookNow());
		
		BookingConfirmation page4 = new BookingConfirmation();
		Thread.sleep(5000);
		
		System.out.println(page4.getOrderno().getAttribute("value"));  
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
