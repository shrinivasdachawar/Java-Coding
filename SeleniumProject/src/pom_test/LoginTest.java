package pom_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void LoginToHRM() {
		
		lp.loginToApp();
	}
	
	@Test(priority = 2)
	public void verifyURL()
	{
	boolean 	valuereturned = lp.getUrl();
	Assert.assertTrue(valuereturned);
	}
}
