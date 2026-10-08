package programpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String source=driver.getPageSource();
		if(source.contains("Gmail"))
		{
			System.out.println("Text is present");
		}
		else {
			System.out.println("Text is Not present");
		}
	}

}
