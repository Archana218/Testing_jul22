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
import com.purna.pages.BankBankDashboardPage;
import com.purna.pages.BankDashboardPage;
import com.purna.pages.CustomerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BankCreateNewBank_StepDefinitions {
	private WebDriver driver;
	private TestContext testContext;
	private BankDashboardPage onBankDashboardPage;
	private BankBankDashboardPage onBankBankDashboardPage;
	Utilities utils;
	
	public BankCreateNewBank_StepDefinitions(TestContext context) {
		testContext = context;
		driver = testContext.getDriver();
		onBankDashboardPage = new BankDashboardPage(driver);
		onBankBankDashboardPage = new BankBankDashboardPage(driver);
		utils = new Utilities();
	}

	@When("User Click on Bank Dashboard Link it should be on bank dashboard page")
	public void user_click_on_bank_dashboard_link_it_should_be_on_bank_dashboard_page() {
		onBankDashboardPage.link_bankDashboard.click();
	}

	@When("User Click on Add New Bank Button")
	public void user_click_on_add_new_bank_button() {
		onBankBankDashboardPage.btn_addNewBank.click();
	}

	@When("User enter below detail")
	public void user_enter_below_detail(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		onBankBankDashboardPage.txtbox_bankName.sendKeys(data.get(0).get(0));
		onBankBankDashboardPage.txtbox_accountName.sendKeys(data.get(0).get(1));
		onBankBankDashboardPage.txtbox_accountNo.sendKeys(data.get(0).get(2));
		onBankBankDashboardPage.txtbox_branch.sendKeys(data.get(0).get(3));
		onBankBankDashboardPage.txtbox_ifsc.sendKeys(data.get(0).get(4));
		onBankBankDashboardPage.txtbox_balance.sendKeys(data.get(0).get(5));
	}

	@When("User click on Add Bank")
	public void user_click_on_add_bank() {
		onBankBankDashboardPage.btn_addBank.click();
	}

	@When("Uesr hendle Alert")
	public void uesr_hendle_alert() {
		utils.acceptAlert(driver);  
	}

	@Then("User Verify that new bank creation")
	public void user_verify_that_new_bank_creation() {
		WebElement dropdown_entries = driver.findElement(By.xpath("//select[@name = 'example1_length']"));
		utils.doDropdownUsingIndex(dropdown_entries, 4);
		driver.navigate().refresh();
		Assert.assertEquals(driver.findElement(By.xpath("//tr/td[text() = '7895641259']")).getText(), "7895641259");
	}

}
