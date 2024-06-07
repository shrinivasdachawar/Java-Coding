package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollingInSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement terms = driver.findElement(By.xpath("//*[text()=' Terms and Conditions ']"));

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		terms.click();


	}

}
