package pom_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pom_pages.LoginPage;

public class BaseTest{
	
	static WebDriver driver;
	LoginPage lp;
	
	@BeforeSuite
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@BeforeClass
	public void creatObject()
	{
		lp=new LoginPage(driver);
	}
}
