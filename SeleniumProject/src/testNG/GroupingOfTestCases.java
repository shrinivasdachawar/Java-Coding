package testNG;

import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@Test(priority=0,groups="Retesting")
	public void login() {
		System.out.println("login test case");
	}

	@Test(priority=1,groups="Retesting")
	public void dashboard() {
		System.out.println("dashboard test case");
	}

	@Test(priority=0,groups="Smoke")
	public void profile() {
		System.out.println("profile test case");
	}

	@Test(priority=1,groups="Smoke")
	public void performance() {
		System.out.println("performance test case");
	}

	@Test(priority=0,groups="UAT")
	public void recruitment() {
		System.out.println("recruitment test case");
	}

	@Test(priority=1,groups="UAT")
	public void myInfo() {
		System.out.println("my info test case");
	}


}
