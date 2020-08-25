package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MultipleDependencies
{
	 @Test
	 public void login()
	   {
		 Assert.fail();
		Reporter.log("login is sucessfull");
		System.out.println("login is sucessfull");
	   }
	 @Test(dependsOnMethods="login")
	 public void createCustomer()
	   {
	    System.out.println("create customer is sucessfull");
	   }
	 @Test(dependsOnMethods= {"createCustomer","login"})
	 public void deleteCustomer()
	   {
		System.out.println("delete customer is sucessfull"); 
	   }
}
 