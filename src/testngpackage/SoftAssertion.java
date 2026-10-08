package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://happytenant.tech/users/sign_in");
	}
	
	@Test
	public void softAssetion()
	{
		SoftAssert soft=new SoftAssert();
		String forgotpasswordlink=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[3]/div/div[2]/form/div/div[4]/a")).getText();
		String expectedTitle="Forgot Password";
		soft.assertEquals(forgotpasswordlink, expectedTitle,"Text Mismatch");
		
		
		String title=driver.getTitle();
		soft.assertEquals(title, "HappyTenant","Title Mismatch");
		System.out.println("Title Mismatched");
		soft.assertAll();	}

}
