package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	
	@Parameters({"v"})
	@Test
		public void test(String v)
		{
		System.out.println("value is="+v);
		}
	

}
