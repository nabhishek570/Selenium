package programpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver(); //To open browser
		driver.get("https://www.selenium.dev/downloads/"); //To launch application
		driver.quit(); //To quit or close
		}

}
