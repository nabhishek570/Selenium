package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtils;

public class DataDrivenTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@DataProvider(name="loginData")
	public Object[][] getData() throws Exception
	{
		String filepath= "\"C:\\Users\\Anagha Anilkumar\\OneDrive\\Book 10.xlsx\"";
		return ExcelUtils.getCellData(filepath, "Sheet1");
		
	}
	
	@Test(dataProvider="loginData")
	public void loginTest(String Username,String Password) {
		driver.findElement(By.id("ulogin")).clear();
		driver.findElement(By.id("ulogin")).sendKeys(Username);
		driver.findElement(By.id("upass")).clear();
		driver.findElement(By.id("upass")).sendKeys(Password);
		driver.findElement(By.id("sub_logbtn")).click();
		
		System.out.println("Executed for="+Username);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		
		
	}

}
