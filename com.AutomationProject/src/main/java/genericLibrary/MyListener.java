package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

//BaseTest extends to MyListeners to up casting TakesScreenshot for driver 
public class MyListener extends BaseTest implements ITestListener{
	//right click on ITestListener --Source--select override Method
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("--test--"+result.getName()+" started", true);	
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("--test--"+result.getName()+" succeessed", true);	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getName();
		String ldt = LocalDateTime.now().toString();
		String timestamp = ldt.replace(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/"+failedMethod+timestamp+".png");
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("--test--"+result.getName()+" skipped", true);	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("--test--"+result.getName()+" failed within success percentage", true);	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("--test--"+result.getName()+" failed with timeout", true);	
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("--test--"+ context.getName()+" is started", true);	
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("--test--"+ context.getName()+" finished", true);	
	
	}
	
	
	}
