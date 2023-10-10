package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

//@Listeners(com.actitime.generic.ListenerImplemention.class)
public class CustomerModule {
	@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
//	HomePage hg1 = new HomePage( driver);
//	hg1.task();
//	TaskListpage tl = new TaskListpage(driver);
//	tl.getAddnew().click();
//  FileLib f1 = new FileLib();
//  String name = f1.readDataFromExcel("Sheet2",1,2);
//  String des = f1.readDataFromExcel("Sheet2", 1, 3);
//	Thread.sleep(2000);
//	tl.getNewcustomer().click();
//	Thread.sleep(2000);
//	tl.getCusname().sendKeys(name);
//	Thread.sleep(2000);
//	tl.getCusdes().sendKeys(des);
//	Thread.sleep(2000);
//	tl.getCustdrop().click();
//	Thread.sleep(2000);
//	tl.getSelectcom().click();
//	Thread.sleep(2000);
//	tl.getCreatecus().click();
//	Thread.sleep(8000);
		Reporter.log("createCustomer",true);
	
}
	//@Test(priority = 2)
//	public void deleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException
//	{
////		HomePage hg1 = new HomePage( driver);
//		hg1.task();
//		FileLib f1 = new FileLib();
//		Thread.sleep(2000);
//		 String name = f1.readDataFromExcel("Sheet2",1,2);
//		TaskListpage tl = new TaskListpage(driver);
//		tl.getSearchBox().sendKeys(name);Thread.sleep(2000);
//		tl.getHighlightedElement().click();Thread.sleep(2000);
//		tl.getSettingsBtn().click();Thread.sleep(2000);
//		tl.getActionsBtn().click();Thread.sleep(2000);
//		tl.getDeleteBtn().click();Thread.sleep(2000);
//		tl.getDeletePermanentlyBtn().click();Thread.sleep(2000);
//		
//	}


}
