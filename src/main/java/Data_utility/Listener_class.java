package Data_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;
import GenericUtility.Baseclass;

public class Listener_class implements ITestListener {

	public void onTestStart(ITestResult result) {
	
		String methodName = result.getMethod().getMethodName();
		//Reporter.log(methodName+" -test script Started");
		System.out.println(methodName+" -test script Started");
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" -test script Success");
		System.out.println(methodName+" -test script Success");
	}

	public void onTestFailure(ITestResult result)
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" -test script fail");
		System.out.println("test Script failed");
		
//		 TakesScreenshot ts=(TakesScreenshot)Baseclass.driver;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//			File dest=new File(".\\src\\main\\resources\\screenshots"+methodName+".png");
//			try {
//				Files.copy(src, dest);
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
			
		WebDriver_Utility w=new WebDriver_Utility();
		String ScreenshotName = methodName+w.getsystemDateFormat();
		System.out.println(ScreenshotName);

		try {
			w.screenshot(Baseclass.driver, ScreenshotName);
		} catch (Exception e1) {
		
			e1.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+" -test script Skip");
		System.out.println(methodName+" -test Script Skipped");	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test is Started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test is Finished");

	}
	
}
