package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","H:\\PriyankaDhumal\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
			//ChromeOptions opt =new ChromeOptions();
			//opt.addArguments("--disable notification");
		  driver=new ChromeDriver();
			
		
			 Thread.sleep(1000);
			 
			 driver.get("https://www.flipkart.com/");
			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				/*
			 Actions ac=new Actions(driver);
			 //WebElement Serach= driver.findElement(By.xpath("//input[@type='text'])"));
			// ac.moveToElement(Serach).build().perform();
			 WebElement f=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
			 ac.moveToElement(f).build().perform();
			*/ 
			 
			 
			 WebElement Searchbox= driver.findElement(By.name("q"));
			Searchbox.click();
			Searchbox.sendKeys("TShirt");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}

}
