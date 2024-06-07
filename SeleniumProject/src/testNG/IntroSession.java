package testNG;

import org.testng.annotations.Test;

public class IntroSession {

	@Test(priority = -1)

	public void login() {
		System.out.println("login test case");
	}

	@Test(priority = 0)
	public void dashboard() {
		System.out.println("dashboard test case");
	}

	@Test(priority = 1)
	public void profile() {
		System.out.println("profile test case");
	}

}
