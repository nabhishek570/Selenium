package programpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleerification {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String actualtitle = driver.getTitle();
		String expectedtitle="Selenium";
		if (actualtitle.equals(expectedtitle))
		{
			System.out.println("Pass");
		}
		else 
		{ 
		    System.out.println("Fail");
		}
	}

}
