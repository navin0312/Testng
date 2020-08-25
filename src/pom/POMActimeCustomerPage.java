package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActimeCustomerPage
{
	 //WebDriver driver;
	 @FindBy(id="username")
	 private WebElement usernameTextField;
	 @FindBy(xpath="//input[@type='password']")
	 private WebElement passwordTextField;
	 @FindBy(id="keepLoggedInLabel")
	 private WebElement keepmeloggedinCheckBox;
	 @FindBy(xpath="//div[text()='Login ']")
	 private WebElement loginButton;
	 //login get done
	 @FindBy(id="container_tasks")
	 private WebElement tasksLink;
	 @FindBy(xpath="//div[.='Add New']")
	 private WebElement addnewDropdownlist;
	 @FindBy(xpath="//div[@class='item createNewCustomer']")
	 private WebElement newcustomerLink;
	 @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	 private WebElement entercustomernameTextfield;
	 @FindBy(xpath="//div[.='Create Customer']")
	 private WebElement createcustomerButton;
	 //new customer get created
	 //declaration get done from login to create customer
	 public POMActimeCustomerPage(WebDriver driver)
	 {
		// this.driver=driver;
		 PageFactory.initElements(driver, this);//initialization of WebElement get done
	 }
	 public void loginMethod()//utilization get done 
	 {
		 usernameTextField.sendKeys("admin");
		 passwordTextField.sendKeys("manager");
		 keepmeloggedinCheckBox.click();
		 loginButton.click();
	 }
	 public void createnewcustomerMethod() throws InterruptedException//utilization get done
	 {
		 tasksLink.click();
		 Thread.sleep(3000);
		 addnewDropdownlist.click();
		 Thread.sleep(3000);
		 newcustomerLink.click();	 	 
		 Thread.sleep(5000);
		 entercustomernameTextfield.sendKeys("manish");
		 Thread.sleep(3000);
		 createcustomerButton.click();
		 
	 }
	    
	 
}
