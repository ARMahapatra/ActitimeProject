package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnersImplementation.class)
public class ProjectModule extends BaseClass{
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException {
		Reporter.log("Create Project",true);
		FileLib f = new FileLib();
		String pn = f.getExcelData("CreateProject",1,3);
		String pd = f.getExcelData("CreateProject",1,4);
		HomePage h = new HomePage(driver);
	    h.setTaskMenu();
	    TaskListPage t = new TaskListPage(driver);
	   t.getAddNewBtn().click();
	   t.getNewProjectBtn().click();
	   t.getProjectNameTbx().sendKeys(pn);
	   t.getCustomerDD().click();
	   Actions a = new Actions(driver);
	   a.moveToElement(t.getSelectCustomer()).click().perform();
	   t.getProjectDescriptionTbx().sendKeys(pd);
	   t.getCreateProjectBtn().click();
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.textToBePresentInElement(t.getActualProject(),pn));
	   String actualText = t.getActualProject().getText();
	   Assert.assertEquals(actualText,pn);
}
}
