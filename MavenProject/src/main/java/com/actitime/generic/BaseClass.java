package com.actitime.generic;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public  WebDriver driver;
//	@BeforeClass
////	@Parameters("browser")
////	public void openBrowser() throws IOException {
////		driver=new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
////		FileLib f = new FileLib();
////		String s = f.readDataFromProperty("url");
////		driver.get(s);
////		Reporter.log("openBrowser", true);
////	}
//
//	@BeforeMethod
////	public void login() throws EncryptedDocumentException, IOException {
////		LoginPage lg = new LoginPage(driver);
////		FileLib f = new FileLib();
////		String us = f.readDataFromProperty("username");
////		String pw = f.readDataFromProperty("password");
////        lg.login(us, pw);
////		Reporter.log("login", true);
//	}
//
//	@AfterMethod
////	public void logout() {
////		HomePage hg = new HomePage(driver);
////		hg.logout();
////		
////		Reporter.log("logout", true);
////	}
//
//	@AfterClass
//	public void closedBrowser() {
//		driver.quit();
//		Reporter.log("closedBrowser", true);
//	}
//
//	
}
