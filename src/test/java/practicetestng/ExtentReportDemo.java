package practicetestng;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportDemo {
	@Test
	public void loginTest() throws IOException {


		Assert.assertEquals("loginsucess", "loginsucess");

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		ExtentTest logger =extent.createTest("loginTest", "Description");

		logger.log(Status.INFO, "Login to facebook");

		logger.log(Status.PASS, "loginsucess");
		
		
		ExtentTest logger1 =extent.createTest("LogofTest", "Description");
		
		logger1.log(Status.FAIL, "LogofFail");
		logger1.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("G:\\CTS Stuff\\Images\\manju.png").build());
		
		
		extent.flush();
		




	}
}
