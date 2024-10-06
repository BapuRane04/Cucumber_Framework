package com.magento.commonSteps;

import java.io.File;
import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {
	
	private static SimpleDateFormat hrMin = new SimpleDateFormat("hhmm");
	private static final String dateWiseTimeStamp = String.valueOf(hrMin.format(System.currentTimeMillis()));
	private static ExtentReports extent;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"ExtentReport"+dateWiseTimeStamp+".html";
	
	public static ExtentReports getInstance() {
		if(extent == null) {
			createInstance();
		}
		return extent;
	}

	private static ExtentReports createInstance() {
		htmlReporter = new ExtentHtmlReporter(filePath);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		return extent;
	}
}
