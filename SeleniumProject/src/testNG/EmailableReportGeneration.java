package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailableReportGeneration {
	
	@Test
	public void login() {
		System.out.println("login test case");
		Reporter.log("login test case",true);
	}
	@Test()
	public void dashboard() {
		System.out.println("dasgboard test case");
		Reporter.log("dashboard test case", true);
	}
	@Test
	public void profile() {
		System.out.println("profile test case");
		Reporter.log("profile test case", true);
	}


}
