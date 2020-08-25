package annotations;

import org.testng.annotations.Test;

public class CyclicDependencies 
{
	@Test(dependsOnMethods="manish")
	public void navin()
	{
		System.out.println("navin method got executed sucessfully");
	}
	@Test(dependsOnMethods="navin")
	public void manish()
	{
		System.out.println("manish method got executed sucessfullly");
	}
}
