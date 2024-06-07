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

public class ActualAnnotations {
	
	@BeforeSuite
	public void openBrowser() {
		System.out.println("browser get lanched");
	}

	@BeforeClass
	public void loginToApp() {
		System.out.println("logged in to application");
	}

	@AfterClass
	public void loggedOff() {
		System.out.println("logged out");
	}

	@BeforeMethod
	public void navigateToTestCaseUrl() {
		System.out.println("go to specific page");
	}

	@AfterMethod
	public void backToPreviousPage() {
		System.out.println("go back to previous page");
	}
	@Test
	public void testCaseOne() {
		System.out.println("test case one");
	}
	@AfterSuite
	public void quiteBrowser() {
		System.out.println("browser got shutdown");
	}
	@BeforeTest
	public void navToTestUrl() {
		System.out.println("navigating to test url");
	}
	@AfterTest
	public void navToOriginalUrl() {
		System.out.println("navigate bacck to original url");
	}

}
