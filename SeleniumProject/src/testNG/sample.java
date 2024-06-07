package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {

	WebDriver driver;

	@BeforeMethod()
	public void launchbrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");

		Thread.sleep(4000);
		
	}

	@Test()
	public void verifyTitle()

	{
		
		String Title = driver.getTitle();
		System.out.println("the page title is : " +Title);
		Assert.assertEquals(Title, "Google");
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
