package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Base;
import POMClass.KiteHomePage;
import POMClass.KiteLoginPage;
import POMClass.KitePinPage;
import Utility.Utility;

public class Kite_App_Test1  extends Base
{
	
	KiteLoginPage login;// declaration
	KitePinPage pin;
	KiteHomePage home;
	@Parameters("BrowserName")
	@BeforeClass
	public void launchBrowser(String BrowserName) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Initailising browser", true);
		browserInitialise(BrowserName);
		
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("entering UseriD and Password", true);
		Reporter.log("Entering  Correct Password",true);
		login.enterUserId(Utility.getDataFromPropertyFile("UN"));
		login.enterPassword(Utility.getDataFromPropertyFile("PWD"));
		login.ClickOnLoginButton();
		Thread.sleep(2000);
	Reporter.log("Entering Pin", true);
	Thread.sleep(2000);
		pin.enterPIN(Utility.getDataFromPropertyFile("PIN"));
Thread.sleep(2000);
		pin.clickOnContinueButton();
	}
	
	
	@Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException, InterruptedException 
{
		//int TCID=201;
		Thread.sleep(1000);
		String ActualUserID = home.userIDValidation();
		Thread.sleep(1000);
		String ExpextedUserID = Utility.getDataFromPropertyFile("UN");
		Reporter.log("Validating UserID", true);
	
		Assert.assertEquals(ActualUserID, ExpextedUserID,"User ID not matching TC Failed");
		//Reporter.log("User ID Matching TC "+TCID+" is passed",true);
		Reporter.log("Taking screenshot", true);
		Thread.sleep(1000);
		//Utility.CaptureScreen(driver, TCID);

}
	
	@Test(enabled=false)
	public void validateUserIDErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//int TCID=102;
		String ActualUserIDMsg=login.getUserIDErrorMsg();
		String ExpectedUserIDErrorMsg=Utility.getDataFromPropertyFile("Error2");
		Assert.assertEquals(ActualUserIDMsg, ExpectedUserIDErrorMsg, "TC Failed,Enter ValideUserID");
		Thread.sleep(1000);
		Reporter.log("Error Msg occure if user enter only correct password",true );
		//Utility.CaptureScreen(driver, TCID);
		
	}
	
	
	@AfterMethod
	public void LogOutFromKite() throws InterruptedException
	{
		Thread.sleep(1000);
		Reporter.log("logging out..", true);
		Thread.sleep(1000);
		home.ClickOnUserID();
		Thread.sleep(1000);
		home.ClickOnLogout();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Closing browser", true);
		driver.close();
	}
}
