package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaitsDiscussion {
	//Waits==is the one who made synchronization between web-page loading speed and code execution speed.
	//Types==1.Static Wait 2.Dynamic wait
	//static wait==Thread.sleep();
	//Dynamic wait==1.implicit wait 2.explicit wait 3.fluent wait

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		

	}

}