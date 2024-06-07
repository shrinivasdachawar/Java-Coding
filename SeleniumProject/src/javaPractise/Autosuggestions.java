package javaPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//*[text() = 'selenium']"));
		
		int totalsuggestions = suggestion.size();
		
		System.out.println(totalsuggestions);

		suggestion.get(8).click();
		
		
		
				

	}

}
