package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDiscussion {

	@Test
	public void testcase1() {
		System.out.println("testcase one");
		Assert.assertFalse(true, "testcase failed please file bug");
	}

	@Test
	public void msgValidataion() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		WebElement errormsg = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
		String actualmsg = errormsg.getText();
		System.out.println(actualmsg);

		boolean ispresent = actualmsg.contains("Invalid");
		Assert.assertTrue(ispresent);

	}

}
