package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.beust.jcommander.Parameter;

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
