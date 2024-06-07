package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownDiscussion {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

		List<WebElement> totaloptions = driver.findElements(By.xpath("//*[@role='menuitem']"));

		int countofoption = totaloptions.size();
		System.out.println(countofoption);
		//totaloptions.get(0).click();
		totaloptions.get(2).click();
		
		// driver.findElement(By.xpath("//*[text()='About']")).click();
	}

}
