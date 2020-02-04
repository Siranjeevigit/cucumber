package com.stepdefin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	static WebDriver driver;
	Select s;
	
	

	@Given("user is in login page of Adactin Hotel")
	public void  browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips new workapce\\Cucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		
		
		
	}
	@When("user should enter the {string} and {string}")
	public void loginDetails(String s1, String s2) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(s1);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(s2);
	}

	@When("user click the login button")
	public void loginButton() {
		WebElement btnLogin = driver.findElement(By.id("login"));
	    btnLogin.click();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully(){
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("search");
	}

	@When("user select the location {String} and {String} and {String} and {String} and {String} and {String}")
	public void user_select_the_location_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
		s = new Select(driver.findElement(By.id("location")));
		s.selectByVisibleText("Sydney");
		s = new Select(driver.findElement(By.id("hotels")));
		s.selectByIndex(1);
		s = new Select(driver.findElement(By.id("room_type")));
		s.selectByIndex(1);
		s = new Select(driver.findElement(By.id("room_nos")));
		s.selectByIndex(1);
		s = new Select(driver.findElement(By.id("adult_room")));
		s.selectByIndex(2);
		s = new Select(driver.findElement(By.id("child_room")));
		s.selectByIndex(2);
	}

	@When("user should click the check box")
	public void user_should_click_the_check_box() throws Throwable {
	}

	@Then("^user should click the continue button$")
	public void user_should_click_the_continue_button() throws Throwable {
	}

	@When("^user should enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_enter_the_and_and_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
	}

	@Then("^user should click the book successfully$")
	public void user_should_click_the_book_successfully() throws Throwable {

}
}