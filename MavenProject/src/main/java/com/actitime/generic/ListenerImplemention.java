//package com.actitime.generic;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
////public class ListenerImplemention extends BaseClass implements ITestListener {
////
////	public void onTestStart(ITestResult result) {
////		
////	}
////
////	
////	public void onTestSuccess(ITestResult result) {
////		String name = result.getName();
////		Reporter.log(name+" has got passed",true);
////	}
////
////
////	public void onTestFailure(ITestResult result) {
////		String name = result.getName();
////		Reporter.log("failure");
////		TakesScreenshot ts = (TakesScreenshot)driver;
////		File srcfile = ts.getScreenshotAs(OutputType.FILE);
////		File destfile = new File("./sceenshot/"+name+".png");
////		try {
////			FileUtils.copyFile(srcfile, destfile);
////		} catch (IOException e) {
////			
////		}
////		
////	}
////
////	
////	public void onTestSkipped(ITestResult result) {
////		String name = result.getName();
////		Reporter.log(name+" has got skipped",true);	
////	}
////
////	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
////		
////	}
////
////	
////	public void onTestFailedWithTimeout(ITestResult result) {
////		
////	}
////
////	
////	public void onStart(ITestContext context) {
////		
////	}
////
////	public void onFinish(ITestContext context) {
////		
////	}
////
////}
