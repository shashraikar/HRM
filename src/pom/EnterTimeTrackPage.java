package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import generic.Base_Page;

public class EnterTimeTrackPage extends Base_Page
{
	@FindBy(id="logoutLink")
	private WebElement Logout;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement Help;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement aboutActiTIME;
	
	@FindBy(xpath="//span[contains(., 'actiTIME')]")
	private WebElement Version;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement Close;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickLogout()
	{
		Logout.click();
	}
	
	public void clickHelp()
	{
		Help.click();
	}
	
	public void clickAboutactiTime()
	{
		aboutActiTIME.click();
	}
	
	public void clickclose()
	{
		Close.click();
	}
	
	public void verifyHomePage(String Hp_title)
	{
		verifyTitle(Hp_title);
	}
	
	public void verifyActiTimeVersion(String eversion)
	{
		String aversion =Version.getText();
		
		try
		{
			Assert.assertEquals(aversion, eversion);
			Reporter.log("Version is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("Version is nmot matching", true);
			Assert.fail();
		}
	}
}
