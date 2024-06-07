package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class ParellalExecutionOfTest2 {
	@Test
	public void avtar() {
		System.out.println("avtar test case");
       Reporter.log("avtar test case", false);
	}

	@Test
	public void myInfo() {
		System.out.println("my info test case");
		Reporter.log("my info test case", false);
	}

	@Test
	public void recruitment() {
		System.out.println("recruitment test case");
		Reporter.log("recruitment test case", false);
	}
}
