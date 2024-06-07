package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class InclusionOfMethod {

	@Test
    public void login() {
		System.out.println("login test case");
		Reporter.log("login test case", false);
	}
	@Test
	public void dashboard() {
		System.out.println("dashboard test case");
		Reporter.log("dasboard test case", false);
	}
	
	@Test 
	public void profile() {
		System.out.println("profile test case");
		Reporter.log("profile test case",false);
	}


}
