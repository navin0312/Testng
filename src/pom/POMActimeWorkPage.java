package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMActimeWorkPage 
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
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofworkLink;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofworkLink;
	@FindBy(id="name")
	private WebElement nameTextField;
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropdown;
	@FindBy(id="billingType_setNonBillable")
	private WebElement nonbillableRdioButton;
	@FindBy(id="billingType_setBillable")
	private WebElement billableRadioButton;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createtypeofworkButton;
	@FindBy(id="billingRate_input")
	private WebElement billingrateTextfield;
	
	//declaration get done for the required WebElment
	
	public POMActimeWorkPage(WebDriver driver)
	 {
    	PageFactory.initElements(driver,this);
	 }
	//initialization of WebElements get done
	
	public void loginMethod()
	{
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
        keepmeloggedinCheckBox.click();
        loginButton.click();
        
	}
	public void createWorkMethod() throws InterruptedException
	{
		settingsButton.click();
		Thread.sleep(3000);
		typeofworkLink.click();
		Thread.sleep(3000);
		createtypeofworkLink.click();
		Thread.sleep(3000);
		nameTextField.sendKeys("studenttt");
		Thread.sleep(3000);
		Select sel=new Select(statusDropdown);
		sel.selectByVisibleText("archived");
		Thread.sleep(3000);
		//nonbillableRdioButton.click();
		billableRadioButton.click();
		Thread.sleep(3000);
		billingrateTextfield.sendKeys("200");
		createtypeofworkButton.click();
		
	}
}
