package junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkResponseCode {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void linkResponseCode() 
	{
		driver=new ChromeDriver();
		driver.get("https://happytenant.app/users/sign_in");
	}

	@Test
	public void link() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links="+li.size());
		
		for (WebElement Web:li)
		{
			String link= Web.getDomAttribute("href");
			verify(link);
		}
	}

	private void verify(String link) {

		try {
			URI ob=new URI(link);
			HttpURLConnection con=(HttpURLConnection) ob.toURL().openConnection();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("Successfull:Response Code is 200---"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Broken Link--Response Code is 404---"+link);
			}
			else
			{
				System.out.println("Response Code is --"+con.getResponseCode());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	
	}
}
