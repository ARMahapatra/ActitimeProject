package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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
public class TaskModule extends BaseClass{
	@Test
	public void testCreateTask() throws EncryptedDocumentException, IOException {
		Reporter.log("Create Task",true);
		FileLib f = new FileLib();
//		String cnt = f.getExcelData("CreateTask",1,3);
//		String pnt = f.getExcelData("CreateTask",1,4);
		String tn = f.getExcelData("CreateTask",1,5);
		HomePage h = new HomePage(driver);
	    h.setTaskMenu();
	    TaskListPage t = new TaskListPage(driver);
	   t.getAddNewBtn().click();
	   t.getNewTaskBtn().click();
//	   t.getCustomerForTaskDD().click();
//	   t.getSelectCustomerDM().click();
//	   t.getProjectForTaskDD().click();
//	   t.getSelectProjectDM().click();
	   t.getTaskNameTbx().sendKeys(tn);
	   t.getCreateTaskBtn().click();
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.textToBePresentInElement(t.getActualTask(),tn));
	   String actualText = t.getActualTask().getText();
	   Assert.assertEquals(actualText,tn);
	   
	   
	   
	}
}
