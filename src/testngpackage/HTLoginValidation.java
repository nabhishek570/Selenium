package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTLoginValidation {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://happytenant.tech/users/sign_in");
	}
	
	@Test
	public void login() throws Exception
	{
		Thread.sleep(2000);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		wait.until(ExpectedConditions.urlContains("my_day"));
		String expecturl="https://happytenant.tech/my_day";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expecturl);
	}

}
