package com.purna.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.BankLoginPage;
import com.purna.pages.LoginPage;

import io.cucumber.java.en.Given;

public class Common_StepDefinitions extends Utilities
{
    private WebDriver driver = null;
    private BankLoginPage onBankLoginPage;
    private TestContext testContext = null;
    private LoginPage onLoginPage;
    
    private static Logger Log = LoggerFactory.getLogger(Common_StepDefinitions.class);
    
    public Common_StepDefinitions(TestContext context)
    {
        testContext = context;
        driver = context.getDriver();
        onLoginPage = new LoginPage(driver);
        onBankLoginPage = new BankLoginPage(driver);
    }

    @Given("User is on bank login page {string} {string}")
    public void userIsOnPurnaLoginPage(String testCaseID, String moduleName){
        testContext.setTestCaseID(testCaseID);
        openLoginPage(driver, testContext, testCaseID, moduleName);
        Log.info("-------------------------------------------------------------");
        Log.info("Test Case " + testCaseID + " STARTED");
    }
    
    @Given("User is logged into Purna application {string} {string}")
	public void user_is_logged_into_purna_application(String testCaseID, String moduleName) {
    	testContext.setTestCaseID(testCaseID);
        openLoginPage(driver, testContext, testCaseID, moduleName);
        Log.info("-------------------------------------------------------------");
        Log.info("Test Case " + testCaseID + " STARTED");
        
    	onLoginPage.txtbox_username.sendKeys(configProperties.getProperty("username"));
    	onLoginPage.txtbox_password.sendKeys(configProperties.getProperty("password"));
    	onLoginPage.btn_login.click();
	}
    
    @Given("User is logged into Bank Domain application {string} {string}")
    public void user_is_logged_into_bank_domain_application(String testCaseID, String moduleName) {
    	testContext.setTestCaseID(testCaseID);
    	openLoginPage(driver, testContext,testCaseID, moduleName);
    	Log.info("-------------------------------------------------------------");
    	Log.info("Test Case " + testCaseID + " STARTED");
    	
    	onBankLoginPage.txtbox_username.sendKeys(testContext.getMapTestData().get("username"));
		onBankLoginPage.txtbox_Password.sendKeys(testContext.getMapTestData().get("password"));
		onBankLoginPage.btn_Login.click();
    }
}
