package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class LoginPage extends Base_Page {

	@FindBy(id="username")
	private WebElement untbox;
	
	@FindBy(name="pwd")
	private WebElement pwdtbox;
	
	@FindBy(xpath=("//div[.='Login ']"))
	private WebElement Login;
	
	@FindBy(xpath=("//span[contains(.,'invalid')]"))
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void setUsername(String un)
	{
		untbox.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		Login.click();
	}
	
	public void verifyErrmsg()
	{
		verifyElement(errmsg);
	}
	
	public void verifyLoginPage(String lp_title)
	{
		verifyTitle(lp_title);
	}
}
