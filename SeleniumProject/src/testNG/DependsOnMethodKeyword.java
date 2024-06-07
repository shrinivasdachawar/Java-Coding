package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodKeyword {
	
	@Test()
	public void login() {
		System.out.println("login test case");
		Assert.fail();
		
	}
	@Test(dependsOnMethods="login")
	public void dashboard() {
		System.out.println("dasgboard test case");
	
	}
	@Test()
	public void profile() {
		System.out.println("profile test case");
		
	}


}
