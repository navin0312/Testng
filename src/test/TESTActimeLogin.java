package test;//specially for execution because  it has main method 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.POMActimeLoginPage;

public class TESTActimeLogin 
{

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		//now i need to perform the main operation
		 POMActimeLoginPage login=new  POMActimeLoginPage(driver);
		 login.loginMethod();
		

	}

}
