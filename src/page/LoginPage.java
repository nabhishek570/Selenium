package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By emailfield=By.id("ulogin");
	By passwordfield=By.id("upass");
	By loginbutton=By.id("sub_logbtn");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setValues(String username, String password)
	{
		driver.findElement(emailfield).sendKeys(username);
		driver.findElement(passwordfield).sendKeys(password);
	}
	
	public void loginclick()
	{
		driver.findElement(loginbutton).click();
	}
}

