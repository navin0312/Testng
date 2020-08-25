package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navin 
{
 @BeforeMethod
 public void navin()
 {
	 System.out.println("navin");
 }
 @Test
 public void manish()
 {
	 System.out.println("manish");
 }
 @AfterMethod
 public void suryanshu()
 {
	 System.out.println("suryanshu");
 }
}
