package Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Utility.ExtentReportGenrator;
import com.Utility.Library;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listener extends Baseclass implements ITestListener {
ExtentReports extent=Extend_reportgenerator.getReports();
	
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(library.test);
	}

	public void onTestSuccess(ITestResult result) {
		library.test.log(Status.PASS, "Test Case Pass");
		library.test.addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestFailure(ITestResult result) {
		library.test.log(Status.FAIL, "Test Case Fail");
		library.test.addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestSkipped(ITestResult result) {
		library.test.log(Status.SKIP, "Test Case Skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	public static String getCapture() {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}

}
