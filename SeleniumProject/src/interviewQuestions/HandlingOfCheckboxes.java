package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingOfCheckboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary(
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// 1. Select specefic checkbox

		// driver.findElement(By.id("sunday")).click();

		// 2. Select all the Checkboxes

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		/*
		 * for (int i = 0; i < checkboxes.size(); i++) { checkboxes.get(i).click(); }
		 */

		/*
		 * for(WebElement checkbox:checkboxes) { checkbox.click(); }
		 */
		
		//3. Select Last 3 checkboxes
		
		//total num of checkboxes - how many checkboxes want to select = starting index
		//7-3=4
		
		/*for(int i= 4; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click(); 
		}*/
		
		//4. select first 3 checkbox
		
		for (int i=0; i<3;i++)
		{
			checkboxes.get(i).click();
		}
		
	}

}
