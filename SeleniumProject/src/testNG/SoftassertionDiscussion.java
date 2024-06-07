package testNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftassertionDiscussion {

	@Test
	public void testcaseOne() {
		
		int i=50;
		int j=20;
		boolean k=i<j;
		boolean l=i>j;
		
		SoftAssert sa=new SoftAssert();
		sa.assertFalse(k, "test case passed");
		sa.assertFalse(l, "test case fail please fie a bug");
		System.out.println("after assertion");
		sa.assertAll();
		
	}
	
	@Test
	public void testcase2() {
		String s1="Coding";
		String s2="Coding";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(s1, s2);
		
		System.out.println("after assertion");
		sa.assertAll();
	}
	


}
