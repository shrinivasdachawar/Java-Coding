package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParellalExecutionOfTest4 {

	@Test
	public void performance() {
		System.out.println("performance test case");
		Reporter.log("performance test case", false);
		
	}
	@Test
	public void ethics() {
		System.out.println("ethics test case");
		Reporter.log("ethics test case", false);
	}
}
