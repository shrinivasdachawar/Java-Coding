package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPasteMouse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id");
		Actions ac = new Actions(driver);

		WebElement firstname = driver.findElement(By.xpath("//*[@aria-label='First name']"));
		firstname.sendKeys("Shrinivas");
		
		firstname.sendKeys(Keys.CONTROL,"a");
		firstname.sendKeys(Keys.CONTROL,"c");
		
		firstname.sendKeys(Keys.TAB);
		
		WebElement lastname=driver.findElement(By.xpath("//*[@aria-label='Surname']"));
		lastname.sendKeys(Keys.CONTROL,"v");
		
		firstname.sendKeys(Keys.TAB);
		WebElement mobilenumber = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		mobilenumber.sendKeys("9890909090");

		
		
		
	}

}
