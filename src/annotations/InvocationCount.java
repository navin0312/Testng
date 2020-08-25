package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount
{
	 @Test(priority=1)
	 public void navin()
	 {
		 Reporter.log("navin");
	 }
	 @Test(priority=-1,invocationCount=3)
	 public void manish()
	 {
		 Reporter.log("manish");
	 }
	 @Test(priority=0,invocationCount=0)
	 public void rakesh()
	 {
		 Reporter.log("rakesh");
	 }
	
}
