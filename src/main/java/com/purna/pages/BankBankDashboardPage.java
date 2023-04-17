package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankBankDashboardPage {
	
	public BankBankDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class = 'container-fluid']/button")
	public WebElement btn_addNewBank;
	
	@FindBy(xpath="//tr/td[text() = '122133333333342']/following::button[1]")
	public WebElement btn_edit;
	
	@FindBy(xpath="//tr/td[text() = '122133333333342']/following::button[2]")
	public WebElement btn_delete;
	
	@FindBy(xpath="(//input[@name = 'bank_name'])[1]")
	public WebElement txtbox_bankName;
	
	@FindBy(xpath="(//input[@name = 'account_name'])[1]")
	public WebElement txtbox_accountName;
	
	@FindBy(xpath="(//input[@name = 'account_no'])[1]")
	public WebElement txtbox_accountNo;
	
	@FindBy(xpath="(//input[@name = 'branch'])[1]")
	public WebElement txtbox_branch;
	
	@FindBy(xpath="(//input[@name = 'ifsc'])[1]")
	public WebElement txtbox_ifsc;
	
	@FindBy(xpath="(//input[@name = 'balance'])[1]")
	public WebElement txtbox_balance;
	
	@FindBy(xpath="//button[@name = 'add_bank']")
	public WebElement btn_addBank;
	
	@FindBy(xpath="(//input[@name = 'bank_name'])[2]")
	public WebElement txtbox_editBankName;
	
	@FindBy(xpath="(//input[@name = 'account_name'])[2]")
	public WebElement txtbox_editAccountName;
	
	@FindBy(xpath="(//input[@name = 'account_no'])[2]")
	public WebElement txtbox_editAccountNo;
	
	@FindBy(xpath="(//input[@name = 'branch'])[2]")
	public WebElement txtbox_editBranch;
	
	@FindBy(xpath="(//input[@name = 'ifsc'])[2]")
	public WebElement txtbox_editIfsc;
	
	@FindBy(xpath="(//input[@name = 'balance'])[2]")
	public WebElement txtbox_editBalance;
	
	@FindBy(xpath="//div[@class = 'modal-footer justify-content-between']/following::button[3]")
	public WebElement btn_saveChange;
	
}
