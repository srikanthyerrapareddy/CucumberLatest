package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public static ExtentReports reports;
	
	public static ExtentTest test;
	
	public void startReport() {
		
		reports = new ExtentReports("./Reports/report.html",false);
	}
	
	public void startTest(String testname) {
		
	test=	reports.startTest(testname);
	}
	
	
	public abstract long takeSnap();
	
	
	public void logStep(String status, String desc) {
		
	long screenshotnum=	takeSnap();
		if(status.equalsIgnoreCase("pass")) {
			
			test.log(LogStatus.PASS, desc+test.addScreenCapture(".././Reports/screenshot/"+screenshotnum+".png"));
		}
		
		
		
	}
	
	
	public void endTest() {
		
		reports.endTest(test);
	}
	
	public void endReport() {
		
		reports.flush();
	}
	
	
	
	
	
	

}
