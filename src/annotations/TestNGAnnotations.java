package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
  @Test
  public void pooja()
  {
	  Reporter.log("pooja", true);
  }
  @Test
  public void namisha()
  {
	  Reporter.log("namisha", true);
  }
  @Test
  public void kumar()
  {
	  Reporter.log("kumar", true);
  }
  @BeforeSuite 
  public void manish()
  {
	  Reporter.log("manish", true);
  }
  @BeforeTest
  public void rakesh()
  {
	  Reporter.log("rakesh", true);
  }
  @BeforeMethod
  public void kishor()
  {
	  Reporter.log("kishor", true);
  }
  @BeforeClass
  public void newdelhi()
  {
	  Reporter.log("newdelhi", true);
  }
  @AfterMethod
  public void agra()
  {
	  Reporter.log("agra", true);
  }
  @AfterClass
  public void losangeles()
  {
	  Reporter.log("losangekes", true);
  }
  @AfterSuite
  public void chicago()
  {
	  Reporter.log("chicago", true);
  }
  @AfterTest
  public void sandiego()
  {
	  Reporter.log("sandiego", true);
  }
}
