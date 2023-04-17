package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BankDashboardPage {
	
	public BankDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[@class = 'fas fa-tools nav-icon'])[1]")
	public  WebElement link_approveRequests;
	
	@FindBy(xpath="//i[@class = 'nav-icon fas fa-tools']")
	public WebElement link_newRequest;
	
	@FindBy(xpath="(//i[@class = 'nav-icon fas fa-rupee-sign'])[1]")
	public WebElement link_expenseDashboard;
	
	@FindBy(name="((//i[@class = 'nav-icon fas fa-rupee-sign'])[2]")
	public WebElement link_serviceDashboard;
	
	@FindBy(xpath="//i[@class = 'fas fa-rupee-sign nav-icon']")
	public WebElement link_bankDashboard;
	
	@FindBy(xpath="//i[@class = 'fas fa-user nav-icon']")
	public WebElement link_customerDashboard;
	
	@FindBy(xpath = "(//i[@class = 'fas fas fa-user nav-icon'])[1]")
	public WebElement link_staffDashboard;
	
	@FindBy(xpath="//i[@class = 'fas fa-file nav-icon']")
	public WebElement link_salaryDashboard;
	
	@FindBy(xpath = "(//i[@class = 'fas fas fa-user nav-icon'])[2]")
	public WebElement link_staffloginLog;
	
	@FindBy(xpath = "(//a[@class = 'btn btn-primary ml-2 mt-2'])[1]")
	public WebElement linkbtn_newRequest;
	
	@FindBy(xpath = "(//a[@class = 'btn btn-primary ml-2 mt-2'])[2]")
	public WebElement linkbtn_newEntry;
	
	@FindBy(xpath="(//a[@class = 'btn btn-primary ml-2 mt-2'])[3]")
	public WebElement linkbtn_newsuspense;
	
	@FindBy(linkText= "(//a[@class = 'btn btn-primary ml-2 mt-2'])[4]")
	public WebElement linkbtn_whatsAndMail;
	
	@FindBy(xpath="(//a[@class = 'btn btn-success ml-2 mt-2'])[1]")
	public WebElement linkbtn_addAmount;
	
	@FindBy(xpath="(//a[@class = 'btn btn-success ml-2 mt-2'])[2]")
	public WebElement linkbtn_addBank;
	
	@FindBy(xpath="(//a[@class = 'btn btn-success ml-2 mt-2'])[3]")
	public WebElement linkbtn_addService;
	
	@FindBy(xpath="(//a[@class = 'btn btn-success ml-2 mt-2'])[4]")
	public WebElement linkbtn_addStaff;
	
	@FindBy(xpath="(//a[@class = 'btn btn-success ml-2 mt-2'])[5]")
	public WebElement linkbtn_addCustomer;
	
	@FindBy(xpath="(//a[@class = 'btn btn-success ml-2 mt-2'])[6]")
	public WebElement linkbtn_addExpense;
	
	@FindBy(xpath="((//a[@class = 'btn btn-warning ml-2 mt-2'])[1]")
	public WebElement linkbtn_reports;
	
	@FindBy(xpath="(//a[@class = 'btn btn-warning ml-2 mt-2'])[2]")
	public WebElement linkbtn_bill;
	
	@FindBy(xpath="(//a[@class = 'btn btn-warning ml-2 mt-2'])[3]")
	public WebElement linkbtn_transfer;
	
	
}
