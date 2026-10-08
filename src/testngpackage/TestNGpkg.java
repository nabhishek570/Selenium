package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpkg {
	
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		System.out.println("open Browser");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlLoading()
	{
		System.out.println("url link");
	}
	
	@Test(priority = 3,groups = {"sanity"},dependsOnMethods= {"test3"},invocationCount=3)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=1,groups={"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=2,groups={"smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterMethod(alwaysRun = true)
	public void method()
	{
		System.out.println("report");
	}

	@AfterTest(alwaysRun = true)
	public void tearDown()
	{
		System.out.println("close");
	}
}
