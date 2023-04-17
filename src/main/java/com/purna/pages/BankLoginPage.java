package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.purna.libraries.Utilities;

public class BankLoginPage extends Utilities{
	
	public BankLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	public WebElement txtbox_username;
		
	@FindBy(name = "password")	
	public WebElement txtbox_Password;
	
	@FindBy(name = "login")
	public WebElement btn_Login;
	
}
