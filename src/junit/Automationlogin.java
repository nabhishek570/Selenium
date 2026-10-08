package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationlogin {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
}
