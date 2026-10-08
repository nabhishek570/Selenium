package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.BaseClass;
import page.LoginPage;

public class LoginTest extends BaseClass{
	
	//WebDriver driver;
	
	//@BeforeTest
	//public void setUp()
	//{
		//driver=new ChromeDriver();
		//driver.get("https://keralaproperty.in/member/login/");	
	//}

	@Test
	public void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setValues("marcorma7@gmail.com", "marcorma7@gmail.com");
		lp.loginclick();
	}
}
