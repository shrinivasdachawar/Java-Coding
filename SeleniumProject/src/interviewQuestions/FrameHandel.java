package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandel {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		WebElement frame1 = driver.findElement(By.xpath("//*[@id='frame1']"));
		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("selenium");
		
		WebElement frame2=driver.findElement(By.xpath("//*[@id='frame3']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("//*[@id='frame2']"));

		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@id='animals']")).click();
		driver.findElement(By.xpath("//*[text()='Avatar']")).click();

		
	}

}
