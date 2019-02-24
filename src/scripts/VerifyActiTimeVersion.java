package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyActiTimeVersion extends Base_Test 
{
	@Test
	public void testVerifyActiTimeVersion()
	{
		String un=Excel.getCellValue(PATH, "VerifyActiTimeVersion", 1, 0);
		String pwd=Excel.getCellValue(PATH, "VerifyActiTimeVersion", 1, 1);
		String lp_title=Excel.getCellValue(PATH, "VerifyActiTimeVersion", 1, 2);
		String Hp_title=Excel.getCellValue(PATH, "VerifyActiTimeVersion", 1, 3);
		String Version=Excel.getCellValue(PATH, "VerifyActiTimeVersion", 1, 4);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clicklogin();
		
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		ep.verifyHomePage(Hp_title);
		ep.clickHelp();
		ep.clickAboutactiTime();
		ep.verifyActiTimeVersion(Version);
		ep.clickclose();
		ep.clickLogout();
		lp.verifyLoginPage(lp_title);
	}
}
 