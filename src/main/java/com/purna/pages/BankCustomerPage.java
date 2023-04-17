package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.purna.libraries.Utilities;

public class BankCustomerPage extends Utilities{
	
	public BankCustomerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@name = 'first_name'])[1]")
	public WebElement txtbox_addFirstName;
		
	@FindBy(xpath = "(//input[@name = 'last_name'])[1]")	
	public WebElement txtbox_addLastName;
	
	@FindBy(xpath = "(//input[@name = 'contact_no'])[1]")	
	public WebElement txtbox_addContectNo;
	
	@FindBy(xpath = "(//input[@name = 'email'])[1]")	
	public WebElement txtbox_addEmail;
	
	@FindBy(xpath = "(//input[@name = 'aadhar'])[1]")	
	public WebElement txtbox_addAadhar;
	
	@FindBy(xpath = "(//input[@name = 'pan_card'])[1]")	
	public WebElement txtbox_addPanCard;
	
	@FindBy(xpath = "(//input[@name = 'address'])[1]")	
	public WebElement txtbox_addAddress;
	
	@FindBy(xpath = "(//input[@name = 'username'])[1]")	
	public WebElement txtbox_addUsername;
	
	@FindBy(xpath = "(//input[@name = 'password'])[1]")	
	public WebElement txtbox_addPassword;
	
	@FindBy(xpath = "//button[@name = 'add_customer']")
	public WebElement btn_addCutomer;
	
}
