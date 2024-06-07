package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MethodsInselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get(null);// Load a web page current browser

		driver.findElement(null);// When we want interact single webelement
		driver.findElements(null);// interact with list of webelement

		driver.close();// single window
		driver.quit();// multiple window
		driver.getCurrentUrl();// get url of current open pagee
		driver.getTitle();// gets title of the page
		driver.getWindowHandle();// used to handle the single window
		driver.getWindowHandles();// used to handle the multiple window
		driver.navigate().back();// used for backword navigation
		driver.navigate().forward();// used for forword navigation

		driver.navigate().refresh();// used page refreshing

	}

}
