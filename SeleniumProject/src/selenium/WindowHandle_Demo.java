package selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle_Demo {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> allwindow = driver.getWindowHandles();

		for (String winid : allwindow) {
			System.out.println(winid);

			if (!(winid.equals(parentid))) {
				driver.switchTo().window(winid);
				driver.get("https://www.google.com/");

			}
		}

	}
}