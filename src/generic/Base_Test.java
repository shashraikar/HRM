package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_const 
{
	public WebDriver driver;
	static 
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod
	public void OpenAppln()
	{
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void CloseAppln()
	{
		driver.quit();
	}
	
}
