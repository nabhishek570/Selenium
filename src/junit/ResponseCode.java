package junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode {
	
	ChromeDriver driver;

	@BeforeEach
	public void responseCode()
	{
		driver= new ChromeDriver();
		driver.get("https://happytenant.app/users/sign_in");
	}
	
	@Test
	public void code() throws URISyntaxException, MalformedURLException, IOException
	{
		URI ob=new URI("https://happytenant.app/users/sign_in");
		HttpURLConnection con= (HttpURLConnection)ob.toURL().openConnection();
		int code= con.getResponseCode();
		
		if(code==200)
		{
			System.out.println("Successfull- Response code is 200");
		}
		else 
		{
			System.out.println("Response Code is:"+code);
		}
	}

}
