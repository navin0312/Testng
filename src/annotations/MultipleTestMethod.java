package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestMethod
{
 @Test
 public void navin()
 {
	 Reporter.log("navin");
 }
 @Test
 public void manish()
 {
	 Reporter.log("manish");
 }
 @Test
 public void rakesh()
 {
	 Reporter.log("rakesh");
 }
}
