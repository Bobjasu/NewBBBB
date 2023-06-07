package practice;

import org.testng.annotations.Test;

public class SampleTest {
    @Test(priority = 1)
	public void create()
	{
		System.out.println("created");
	}
	@Test(priority = 2,invocationCount = 3,dependsOnMethods = "create")
	public void modified()
	{
		System.out.println("modified");
	}
	@Test(priority = 3)
	public void deleted()
	{
		System.out.println("deleted");
	}
	//1st pull
	//2nd push
	//2nd pull
	//3rd commit
	//3rd pull
}
