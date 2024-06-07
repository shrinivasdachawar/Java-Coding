package testNG;

import org.testng.annotations.Test;

public class EnabledKeyword {
	
	@Test(enabled=true)
	public void login() {
		System.out.println("login test case");
		
	}
	@Test(enabled=true)
	public void dashboard() {
		System.out.println("dasgboard test case");
	
	}
	@Test(enabled=false)
	public void profile() {
		System.out.println("profile test case");
		
	}


}
