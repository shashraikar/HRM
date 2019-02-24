
package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends Base_Test{
	@Test
	public void testValidLoginLogout()
	{
		String un=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 0);
		String pwd=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);
		String lp_title=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 2);
		String Hp_title=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 3);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(un);
		lp.setPassword(pwd);
		lp.clicklogin();
		
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		ep.verifyHomePage(Hp_title);
		ep.clickLogout();
		lp.verifyLoginPage(lp_title);
		
	}

}
