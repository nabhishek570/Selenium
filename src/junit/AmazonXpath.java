package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	ChromeDriver driver;
	
	@BeforeEach
	public void phoneSearch()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void search() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Phones",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id=\"nav-xshop-container\"]/div/ul/li[4]/div/a")).click();
		driver.findElement(By.xpath("//a[@id=\"nav-cart\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"nav-link-accountList\"]/a/div")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_email_login\"]")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();

		

		



	}
}
