package TestClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.Base;

public class Utility_Listner  extends Base  implements ITestListener
{

	 Base b=new Base();
	
	 public   void  onTestStart(ITestResult result)
	 {
		 
	 }
	
	 public   void  onTestSuccess(ITestResult result)
	 {
		// System.out.println("Test Case Pass=====>"+result.getMethod().getMethodName());
		 

			System.out.println("Test passes "+result.getName());
		String TCID=result.getName();
			
			try {
           b.CaptureScreen(TCID);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }

	 public   void  onTestFailure(ITestResult result)
	 {
		
		
				System.out.println("Test Failed "+result.getName());
			String TCID=result.getName();
				
				try {
                  b.CaptureScreen(TCID);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	 }
	
	
	 public   void  onTestSkipped(ITestResult result)
	 {
		 
	 }
	
	 public   void  onStart(ITestContext context)
	 {
		 
	 }
	 public   void  onFinish(ITestContext context)
	 {
		 
	 }
	 

}
