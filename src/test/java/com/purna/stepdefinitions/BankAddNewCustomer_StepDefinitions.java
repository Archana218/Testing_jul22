package com.purna.stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.BankCustomerPage;
import com.purna.pages.BankDashboardPage;
import com.purna.pages.CustomerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BankAddNewCustomer_StepDefinitions {
	private WebDriver driver;
	private TestContext testContext;
	private BankDashboardPage onBankDashboardPage;
	private BankCustomerPage onBankCustomerPage;
	Utilities utils;
	
	public BankAddNewCustomer_StepDefinitions(TestContext context) {
		testContext = context;
		driver = testContext.getDriver();
		onBankDashboardPage = new BankDashboardPage(driver);
		onBankCustomerPage = new BankCustomerPage(driver);
		utils = new Utilities();
	}
	
	@When("User Click add new Customer button from dashboard page")
	public void user_click_add_new_customer_button_from_dashboard_page() {
		onBankDashboardPage.linkbtn_addCustomer.click();
	}

	@When("User enter below Customer details")
	public void user_enter_below_customer_details(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>>data = dataTable.asLists();
	    onBankCustomerPage.txtbox_addFirstName.sendKeys(data.get(0).get(0));
	    onBankCustomerPage.txtbox_addLastName.sendKeys(data.get(0).get(1));
	    onBankCustomerPage.txtbox_addContectNo.sendKeys(data.get(0).get(2));
	    onBankCustomerPage.txtbox_addEmail.sendKeys(data.get(0).get(3));
	    onBankCustomerPage.txtbox_addAadhar.sendKeys(data.get(0).get(4));
	    onBankCustomerPage.txtbox_addPanCard.sendKeys(data.get(0).get(5));
	    onBankCustomerPage.txtbox_addAddress.sendKeys(data.get(0).get(6));
	    onBankCustomerPage.txtbox_addUsername.sendKeys(data.get(0).get(7));
	    onBankCustomerPage.txtbox_addPassword.clear();
	    onBankCustomerPage.txtbox_addPassword.sendKeys(data.get(0).get(8));
	}

	@When("User click on Add Customer")
	public void user_click_on_add_customer() {
		onBankCustomerPage.btn_addCutomer.click();
	}

	@When("Uesr hendle Customer added successfully alert")
	public void uesr_hendle_customer_added_successfully_alert() {
	    driver.switchTo().alert().accept();
	}

	@When("User heldle show entry list drop dowen")
	public void user_heldle_show_entry_list_drop_dowen() {
		WebElement dropdown_entries = driver.findElement(By.xpath("//select[@name = 'example1_length']"));
		utils.doDropdownUsingIndex(dropdown_entries, 4);
		driver.navigate().refresh();
	}

	@Then("User Verify that new Customer creation")
	public void user_verify_that_new_customer_creation() {
		Assert.assertEquals(driver.findElement(By.xpath("//tr/td[text() = 'Archana']")).getText(), "Archana");
	}

}	