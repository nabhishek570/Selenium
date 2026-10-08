package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://happytenant.tech/my_day");
	}

	@Test
	public void hardAssertion() 
	{
		String actualTitle=driver.getTitle();
		String expectedTitle="HappyTenant";
		Assert.assertEquals(actualTitle, expectedTitle,"Title Mismatch");
		System.out.println("End");
	}
	
	@Test
	public void radioButton()
	{
		boolean radio= driver.findElement(By.xpath("//*[@id=\"tenant-form\"]/div[1]/div[2]/div[2]/div[2]/label")).isSelected();
		Assert.assertTrue(radio,"Radio button is not selected");
		System.out.println("End");
	}
}
