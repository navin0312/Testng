package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActimeCustomerPage;
import pom.POMActimeLoginPage;
import pom.POMActimeCustomerPage;

public class TESTActimeCustomer 
{
	@Test
	public void createCustomer() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com");
			//now i need to perform the main operation
			POMActimeCustomerPage login=new  POMActimeCustomerPage(driver);
			login.loginMethod();
		    login.createnewcustomerMethod();
				

	   }

}
