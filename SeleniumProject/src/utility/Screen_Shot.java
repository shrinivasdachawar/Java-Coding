package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		TakesScreenshot scrshot = (TakesScreenshot) driver;

		File source = scrshot.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\dacha\\OneDrive\\Desktop\\ScreenShot\\HRM.png");

		FileHandler.copy(source, destination);
	}

	public void captureScreenshot(WebDriver driver, String filename) throws IOException {

		TakesScreenshot scrshot = (TakesScreenshot) driver;

		File source = scrshot.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\dacha\\OneDrive\\Desktop\\ScreenShot\\HRM.png");

		FileHandler.copy(source, destination);
	}

}
