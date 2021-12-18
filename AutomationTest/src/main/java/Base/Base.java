package Base;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.Utility;

public class Base 
{
  protected static  WebDriver driver;
	
	public void browserInitialise(String BrowserName) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		if(BrowserName.equals("chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver","H:\\PriyankaDhumal\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
		  driver=new ChromeDriver(opt);
			
		
			 Thread.sleep(1000);
		  }
		  
		  else if (BrowserName.equals("Firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","H:\\Velocity\\java selenuim\\geckodriver.exe");
		     driver = new FirefoxDriver(); 
			
		  }
		  
		  driver.get(Utility.getDataFromPropertyFile("URL"));
		  driver.manage().window().maximize();
		  
	}
		  
	public  void CaptureScreen(String TCID ) throws IOException

	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("H:\\PriyankaDhumal\\Zerodha_project\\TestID"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	 
		
}