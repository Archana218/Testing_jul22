package com.purna.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.purna.libraries.TestContext;
import com.purna.pages.BankLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	

public class BankLogin_StepDefinitions{
	WebDriver driver;
	private BankLoginPage onBankLoginPage;
    private TestContext testContext;
    
    public BankLogin_StepDefinitions(TestContext context) {
    	testContext = context;
        driver = testContext.getDriver();
        onBankLoginPage = new BankLoginPage(driver);
    }

	@When("User is on Login Page enters valid username and password")
	public void user_is_on_login_page_enters_valid_username_and_password() {
		onBankLoginPage.txtbox_username.sendKeys(testContext.getMapTestData().get("username"));
		onBankLoginPage.txtbox_Password.sendKeys(testContext.getMapTestData().get("password"));
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		onBankLoginPage.btn_Login.click();
	}

	@Then("User should navigates to dashboard page")
	public void user_should_navigates_to_dashboard_page() {
		Assert.assertEquals(driver.getCurrentUrl(), testContext.getMapTestData().get("expectedUrl"));
	}
	
} 

//@Given("User is on bank login page {string} {string}")
//public void user_is_on_bank_login_page(String string, String string2) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("User is on Login Page enters valid username and password")
//public void user_is_on_login_page_enters_valid_username_and_password() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("User click on Login button")
//public void user_click_on_login_button() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("User should navigates to dashboard page")
//public void user_should_navigates_to_dashboard_page() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@When("User on Login Page enters invalid username and password")
//public void user_on_login_page_enters_invalid_username_and_password() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}