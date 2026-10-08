package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandler {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void windowHandler() {
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();
		Set<String>windowdetails=driver.getWindowHandles();
		for(String tab:windowdetails)
		{
			if(!tab.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(tab);
			    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("marco@gmail.com");
			    driver.close();
			}
		}
		driver.switchTo().window(parentwindow);	}

}
