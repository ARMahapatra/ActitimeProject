package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newCustomerBtn;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement companyDropdown;
	@FindBy(xpath="//div[text()='Big Bang Company']")
	private WebElement companyName;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectNameTbx;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescriptionTbx;
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customerDD;
	@FindBy(xpath = "//div[text()='Our company']")
	private WebElement selectCustomer;
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProject;
	
	
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskBtn;
	@FindBy(xpath="(//div[contains(@class,'customerOrProjectSelector selectorWithPlaceholderContainer')])[1]")
	private WebElement customerForTaskDD;
	@FindBy(xpath="(//div[text()='Our company'])[2]")
	private WebElement selectCustomerDM;
	@FindBy(xpath="//tr[@class='selectCustomerRow']/following::div[@class='components_combobox cpCombobox']")
	private WebElement projectForTaskDD;
	@FindBy(xpath="(//div[text()='Accounting'])[2]")
	private WebElement selectProjectDM;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskNameTbx;
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskBtn;
	@FindBy(xpath="//div[@class='namesContainer']/div[@class='title']")
	private WebElement actualTask;
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getCompanyDropdown() {
		return companyDropdown;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getProjectNameTbx() {
		return projectNameTbx;
	}

	public WebElement getProjectDescriptionTbx() {
		return projectDescriptionTbx;
	}

	public WebElement getCustomerDD() {
		return customerDD;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActualProject() {
		return actualProject;
	}

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getCustomerForTaskDD() {
		return customerForTaskDD;
	}

	public WebElement getSelectCustomerDM() {
		return selectCustomerDM;
	}

	public WebElement getProjectForTaskDD() {
		return projectForTaskDD;
	}

	public WebElement getSelectProjectDM() {
		return selectProjectDM;
	}

	public WebElement getTaskNameTbx() {
		return taskNameTbx;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}

	public WebElement getActualTask() {
		return actualTask;
	}


}
