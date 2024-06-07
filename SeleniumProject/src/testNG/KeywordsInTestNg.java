package testNG;

import org.testng.annotations.Test;

public class KeywordsInTestNg {
	
	@Test(priority=0,invocationCount=4)
	public void login() {
		System.out.println("login test case");
	}

	@Test(priority=1,invocationCount=2)
	public void dashbaord() {
		System.out.println("dashboard test case");
	}

	@Test(priority=2,invocationCount=3)
	public void profile() {
		System.out.println("profile test case");
	}


}
