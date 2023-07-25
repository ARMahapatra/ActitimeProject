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
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("Create Customer",true);
		FileLib f = new FileLib();
		String cn = f.getExcelData("CreateCustomer",1,3);
		String cd = f.getExcelData("CreateCustomer",1,4);
		HomePage h = new HomePage(driver);
	    h.setTaskMenu();
	    TaskListPage t = new TaskListPage(driver);
	   t.getAddNewBtn().click();
	   t.getNewCustomerBtn().click();
	   t.getCustomerName().sendKeys(cn);
	   t.getCustomerDescription().sendKeys(cd);
	   t.getCompanyDropdown().click();
	   Actions a = new Actions(driver);
	   a.moveToElement(t.getCompanyName()).click().perform();
	   t.getCreateCustomerBtn().click();
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomer(), cn));
	   String actualText = t.getActualCustomer().getText();
	   Assert.assertEquals(actualText,cn);
	}
}
