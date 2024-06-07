package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleParametersInTestNg {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hp\\Desktop\\SeleSetupnew\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();

			options.setBinary("C:\\Users\\hp\\Desktop\\SeleSetupnew\\chrome-win64\\chrome-win64\\chrome.exe");

			driver = new ChromeDriver(options);

			driver.manage().window().maximize();
		} else {
			System.out.println("other browser specific test case");
		}

	}

	@Parameters({ "buildversion", "environment", "browser" })
	@Test
	public void infoTestCase(String version, String env, String browser) {
		System.out.println("the build version is " + version);
		System.out.println("the env is " + env);
		System.out.println("the browser name is " + browser);
	}
}
