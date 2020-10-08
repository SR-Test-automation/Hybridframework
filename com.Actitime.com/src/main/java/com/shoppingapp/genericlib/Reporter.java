package com.shoppingapp.genericlib;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {

		public static ExtentReporter htmlReporter;

		public static ExtentReports extent;

		public static ExtentTest test;

		public static void startReport(String OS, String browser) {
	    	// initialize the HtmlReporter
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
	        
	        //initialize ExtentReports and attach the HtmlReporter
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	         
	        //To add system or environment info by using the setSystemInfo method.
	        extent.setSystemInfo("OS", OS);
	        extent.setSystemInfo("Browser", browser);
	        
	        //configuration items to change the look and feel
	        //add content, manage tests etc
//	        htmlReporter.config().setChartVisibilityOnOpen(true);
//	        htmlReporter.config().setDocumentTitle("Extent Report Demo");
//	        htmlReporter.config().setReportName("Test Report");
//	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//	        htmlReporter.config().setTheme(Theme.STANDARD);
//	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	        
	    }
		public static void tearDown() {
		    	//to write or update test information to reporter
		        extent.flush();
		    }
	}


