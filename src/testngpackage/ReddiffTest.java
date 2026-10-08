package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReddiffTest {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}

	@Test
	public void logo()
	{
		WebElement logo= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
	}
	
	@Test
	public void femaleRadio()
	{
		boolean radio= driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[2]/input")).isSelected();
		Assert.assertTrue(radio,"Female radio button is not selected");
		
	}
	
	@Test
	public void createmyaccount()
	{
		WebElement createaccount=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		Assert.assertTrue(createaccount.isEnabled(),"Create My Account is not Enabled");
		
	}
	
	@Test
	public void privacyPolicy()
	{
		WebElement privacypolicy= driver.findElement(By.xpath("/html/body/div[2]/p/a[2]"));
		String actualText= privacypolicy.getText();
		String expectedText="privacy & policy";
		Assert.assertEquals(actualText, expectedText,"Text Mismatch");
	}
}
