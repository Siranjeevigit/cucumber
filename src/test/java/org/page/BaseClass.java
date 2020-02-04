package org.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\Page\\chrome\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	public void type (WebElement element, String name) {
		element.sendKeys(name);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	 public void select(WebElement element, String name) {
		 Select s = new Select(element);
		 s.selectByVisibleText(name);
		 
	 }
	
		
		
		
		
		
	}
	


