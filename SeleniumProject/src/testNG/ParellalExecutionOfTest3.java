package testNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParellalExecutionOfTest3 {
	
	@Test
	public void car() {
		System.out.println("car test case");
		Reporter.log("car test case", false);
	}
	@Test
	public void home() {
		System.out.println("home test case");
		Reporter.log("home test case", false);
	}


}
