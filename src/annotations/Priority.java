package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
	 @Test(priority=1)
	 public void navin()
	 {
		 Reporter.log("navin");
	 }
	 @Test(priority=-1)
	 public void manish()
	 {
		 Reporter.log("manish");
	 }
	 @Test(priority=0)
	 public void rakesh()
	 {
		 Reporter.log("rakesh");
	 }
	 @Test(priority=-1)
	 public void kishor()
	 {
		 Reporter.log("kishor");
	 }
	 @Test
	 public void anish()
	 {
		 Reporter.log("anish");
	 }
	 
}
