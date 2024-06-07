package testNG;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ParellalExecjutionOfTest1 {
	
	@Test
	public void login() {
		System.out.println("login test case");
		Reporter.log("login test case", false);
	}

	@Test
	public void dashboard() {
		System.out.println("dashboard test case");
		Reporter.log("dashboard test case", false);
	}
	@Test
	public void profile() {
		System.out.println("profile test case");
		Reporter.log("profile test case", false);
	}
}
