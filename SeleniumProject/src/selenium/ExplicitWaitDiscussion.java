package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDiscussion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

				ChromeOptions options = new ChromeOptions();

				options.setBinary(
						"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

				WebDriver driver = new ChromeDriver(options);

				driver.manage().window().maximize();

				driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox']"));
				checkbox.click();

				wait.until(ExpectedConditions.elementToBeSelected(checkbox));
				
				//driver.close();


	}

}
