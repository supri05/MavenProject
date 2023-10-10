package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListpage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnew;
	
	public WebElement getAddnew() {
		return addnew;
	}
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	public WebElement getCusname() {
		
		return cusname;
	}
	public WebElement getCusdes() {
		return cusdes;
	}
	public WebElement getCustdrop() {
		return custdrop;
	}
	public WebElement getSelectcom() {
		return selectcom;
	}
	public WebElement getCreatecus() {
		
		return createcus;
	}
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;
	@FindBy(xpath="//input[contains(@class,'inputFieldWithPlaceholder new')]")
	private WebElement cusname;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement cusdes;
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement custdrop;
	@FindBy(xpath="//div[text()='A' and @class='itemRow cpItemRow ']")
	private WebElement selectcom;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcus;
	
	@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
	private WebElement searchBox;
	@FindBy(className = "highlightToken")
	private WebElement highlightedElement;
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='editButton']")
	private WebElement settingsBtn;
	@FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[text()='ACTIONS']")
	private WebElement actionsBtn;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[text()='Delete']")
	private WebElement deleteBtn;
	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement deletePermanentlyBtn;
	public TaskListpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getHighlightedElement() {
		return highlightedElement;
	}
	public WebElement getSettingsBtn() {
		return settingsBtn;
	}
	public WebElement getActionsBtn() {
		return actionsBtn;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getDeletePermanentlyBtn() {
		return deletePermanentlyBtn;
	}
	
	
}