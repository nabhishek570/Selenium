package junit;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
 
	ChromeDriver driver;
	
	@BeforeEach
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://happytenant.app/users/sign_in");
	}
	
	@Test
	public void linkCount()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links="+li.size());
		
		for(WebElement Link:li)
		{
			System.out.println("Link URL="+ Link.getAttribute("href"));
			String Text= Link.getText();
			System.out.println(Link+"----------"+Text);
			
		}
	}
}
