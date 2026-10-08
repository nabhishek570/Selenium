package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("abced@gmail.com");
		WebElement passwordField=driver.findElement(By.name("pass"));
		passwordField.sendKeys("abc123");
		passwordField.submit();
	}
}