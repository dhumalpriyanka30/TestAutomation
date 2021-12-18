package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

public class Kite_App_Test3 extends Base
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
		//Reporter.log("entering UseriD and Password", true);
		//Reporter.log("Entering   Only Correct Password",true);
		//Reporter.log("Entring  Only Correct UserID" ,true);
		//login.enterUserId(Utility.getDataFromPropertyFile("UN"));
		login.enterPassword(Utility.getDataFromPropertyFile("PWD"));
		Thread.sleep(1000);
		login.ClickOnLoginButton();
		Thread.sleep(2000);
	//Reporter.log("Entering Pin", true);
	//	pin.enterPIN(Utility.getDataFromExcel(0, 2));
	//	pin.clickOnContinueButton();
	}
	
	
	@Test(enabled=false)
  public void ValidateUserID() throws EncryptedDocumentException, IOException, InterruptedException 
{
		//int TCID=10;
		Thread.sleep(1000);
		String ActualUserID = home.userIDValidation();
		String ExpextedUserID = Utility.getDataFromPropertyFile("UN");
		Reporter.log("Validating UserID", true);
		Thread.sleep(2000);
		Assert.assertEquals(ActualUserID, ExpextedUserID,"User ID not matching TC Failed");
	//	Reporter.log("User ID Matching TC "+TCID+" is passed",true);
		Reporter.log("Taking screenshot", true);
		Thread.sleep(1000);
		//Utility.CaptureScreen(driver, TCID);

}
	
	@Test(enabled=false)
	public void validateErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//int TCID=102;
		String ActualUserIDMsg=login.getUserIDErrorMsg();
		String ExpectedUserIDErrorMsg=Utility.getDataFromPropertyFile("Error2");
		Assert.assertEquals(ActualUserIDMsg, ExpectedUserIDErrorMsg, "TC Failed,Enter ValideUserID");
		Thread.sleep(1000);
		Reporter.log("Error Msg occure if user enter only correct password",true );
		//Utility.CaptureScreen(driver, TCID);
		
	}
	
	
	@Test(enabled=false)
	public void validatePasswordErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//int TCID=103;
		String ActualPasswordErrorMsg=login.getPasswordErrorMsg();
		String ExpectedPasswordErrorMsg=Utility.getDataFromPropertyFile("Error1");
		Assert.assertEquals(ActualPasswordErrorMsg, ExpectedPasswordErrorMsg, "TC Failed....Enter UserID");
		Thread.sleep(1000);
		Reporter.log("Error Msg occure if user enter only correct UserID",true );
		//Utility.CaptureScreen(driver, TCID);
	}
	
	@Test
	public void validateUserNameMsg() throws EncryptedDocumentException, IOException, InterruptedException
	{    
		////int TCID=203;
	Thread.sleep(1000);
		String ActualErrorMsg=login.getUserIDErrorMsg();
	
		String ExpectedErrorMsg=Utility.getDataFromPropertyFile("Error2");
		Thread.sleep(1000);
		
		Assert.assertEquals(ActualErrorMsg, ExpectedErrorMsg);
		
	    Thread.sleep(1000);
	    Reporter.log("Error Msg occure if User enter correct userId  and  wrong Password",true);
//	   Utility.CaptureScreen(driver, TCID);
	
	}
	
	@AfterMethod(enabled=false)
	public void LogOutFromKite() throws InterruptedException
	{
		Thread.sleep(1000);
		Reporter.log("logging out..", true);
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
