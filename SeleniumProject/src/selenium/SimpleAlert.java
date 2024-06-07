package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SimpleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

				ChromeOptions options = new ChromeOptions();

				options.setBinary(
						"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

				WebDriver driver = new ChromeDriver(options);

				driver.manage().window().maximize();
				
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				driver.findElement(By.xpath("//*[@name='alert']")).click();

				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				
				alert.accept();


	}

}
