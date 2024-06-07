package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectTag {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
	
			ChromeOptions options = new ChromeOptions();
	
			options.setBinary(
					"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");
	
			WebDriver driver = new ChromeDriver(options);
	
			driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id");
		driver.findElement(By.xpath("//*[@aria-label='First name']")).sendKeys("pushpa");
		driver.findElement(By.xpath("//*[@aria-label='Surname']")).sendKeys("gadage");
		driver.findElement(By.xpath("//*[@aria-label='Mobile number or email address']")).sendKeys("9552171024");
		driver.findElement(By.xpath("//*[@aria-label='New password']")).sendKeys("0909");
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));

		Select date = new Select(day);
		date.selectByIndex(0);
		// date.selectByValue("26");

		WebElement month = driver.findElement(By.xpath("//*[@title='Month']"));
		Select months = new Select(month);

		// months.selectByIndex(0);
		months.selectByVisibleText("May");

		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));

		Select yr = new Select(year);
		yr.selectByValue("1996");



	}

}
