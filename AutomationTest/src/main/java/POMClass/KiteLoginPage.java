package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	//Step1. Declaration of variables
		@FindBy(id="userid") private WebElement UserID;
		
		@FindBy(id="password") private WebElement Password;
		
		@FindBy(xpath="//button[@class='button-orange wide']") private WebElement LoginButton;
		
		@FindBy(xpath = "//p[@class='error text-center']") private WebElement ErrorMsg;
		
		
		@FindBy(xpath="//span[contains(text(),'User ID should')]") private WebElement UserIDErrorMsg;
		
		
		@FindBy(xpath="//span[contains(text(),'Password should ')]") private WebElement PasswordErrorMsg;
		
		
		//@FindBy(xpath="//p[@class='error text-center']") private WebElement InvalidErrorMsg;
		//Step2. Initialize variables using Constructor-->PageFactory class and initElements static method
		

		public KiteLoginPage(WebDriver driver)// int a// String name
		
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//Step3. variable usage--> using Methods
		
		public void enterUserId(String Userid)
		{
			UserID.sendKeys(Userid);
			
		}
		
		public void enterPassword(String Pwd)
		{
			Password.sendKeys(Pwd);
		}
		
		public void ClickOnLoginButton()
		{
			LoginButton.click();
		}
		
		public String getUserIDErrorMsg()
		{
			String ActualUserIDErrorMsg=UserIDErrorMsg.getText();
			return ActualUserIDErrorMsg ;
		}
		
		public String getPasswordErrorMsg()
		{
			String ActualPasswordErrorMsg=PasswordErrorMsg.getText();
			return ActualPasswordErrorMsg;
		}
	
/*
		public String getErrorMsg()
		{
			String ActualErrorMsg=InvalidErrorMsg.getText();
			return ActualErrorMsg;
			
		}
		*/
}
