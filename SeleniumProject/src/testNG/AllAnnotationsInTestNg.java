package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsInTestNg {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite annotations");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class annotations");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class annotations");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method annotations");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method annotations");
	}
	@Test
	public void testcase1() {
		System.out.println("testcase1");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite annotations");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test annotations");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test annotations");
	}
}


