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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankEditBank_StepDefinitions {
	private WebDriver driver;
	private TestContext testContext;
	private BankDashboardPage onBankDashboardPage;
	private BankBankDashboardPage onBankBankDashboardPage;
	Utilities utils;
	
	public BankEditBank_StepDefinitions(TestContext context) {
		testContext = context;
		driver = testContext.getDriver();
		onBankDashboardPage = new BankDashboardPage(driver);
		onBankBankDashboardPage = new BankBankDashboardPage(driver);
		utils = new Utilities();
	}

	@When("User Click on Bank Dashboard Link")
	public void user_click_on_bank_dashboard_link() {
		onBankDashboardPage.link_bankDashboard.click(); 
	}

	@When("User Click on Edit Bank Button")
	public void user_click_on_edit_bank_button() {
		WebElement dropdown_entries = driver.findElement(By.xpath("//select[@name = 'example1_length']"));
		utils.doDropdownUsingIndex(dropdown_entries, 4);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		onBankBankDashboardPage.btn_edit.click();
	}

	@When("User enter below details")
	public void user_enter_below_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>>data = dataTable.asLists();
		onBankBankDashboardPage.txtbox_editBankName.clear();
		onBankBankDashboardPage.txtbox_editBankName.sendKeys(data.get(0).get(0));
		onBankBankDashboardPage.txtbox_editAccountName.clear();
		onBankBankDashboardPage.txtbox_editAccountName.sendKeys(data.get(0).get(1));
		onBankBankDashboardPage.txtbox_editAccountNo.clear();
		onBankBankDashboardPage.txtbox_editAccountNo.sendKeys(data.get(0).get(2));
		onBankBankDashboardPage.txtbox_editBranch.clear();
		onBankBankDashboardPage.txtbox_editBranch.sendKeys(data.get(0).get(3));
		onBankBankDashboardPage.txtbox_editIfsc.clear();
		onBankBankDashboardPage.txtbox_editIfsc.sendKeys(data.get(0).get(4));
		onBankBankDashboardPage.txtbox_editBalance.clear();
		onBankBankDashboardPage.txtbox_editBalance.sendKeys(data.get(0).get(5)); 
	}

	@When("User click on Save Change")
	public void user_click_on_save_change() {
		onBankBankDashboardPage.btn_saveChange.click();
	}

	@When("Uesr hendle Alerts")
	public void uesr_hendle_alerts() {
		driver.switchTo().alert().accept();
	}

	@Then("User Verify that bank detail edited")
	public void user_verify_that_bank_detail_edited() {
		WebElement dropdown_entries = driver.findElement(By.xpath("//select[@name = 'example1_length']"));
		utils.doDropdownUsingIndex(dropdown_entries, 4);
		driver.navigate().refresh();
		Assert.assertEquals(driver.findElement(By.xpath("//tr/td[text() = '545648978231']")).getText(), "545648978231");
	}
	
}
