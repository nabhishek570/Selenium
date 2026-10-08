package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTLogin {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://happytenant.tech/users/sign_in");
	}
	
	@Test
	public void htLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
}
