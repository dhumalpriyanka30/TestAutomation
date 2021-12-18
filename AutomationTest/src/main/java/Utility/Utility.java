package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
public class Utility 
{
	public static String getDataFromPropertyFile(String key) throws EncryptedDocumentException, IOException
	{
	Properties obj=new Properties();
	FileInputStream myfile=new FileInputStream("C:\\Users\\prasad\\eclipse-workspace\\Zerodha_Automation\\Zerodha.properties");
		obj.load(myfile);
		String value=obj.getProperty(key);
	return value;
	
	}
}