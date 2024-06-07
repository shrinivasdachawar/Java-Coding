package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DropDown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Users\\dacha\\OneDrive\\Desktop\\Selenium Setup\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://codepen.io/webrajendra/pen/VvjgYY");
		
		//driver.manage().window().setSize(new Dimension(1000, 800));
		
		WebElement frame1 = driver.findElement(By.id("result"));
		
		driver.switchTo().frame(frame1);
			
		List<WebElement> suggestion = driver.findElements(By.xpath("(//*[@class='init']/li)"));
		
		int totalsuggestions = suggestion.size();
		
		System.out.println(totalsuggestions);
		
		suggestion.get(2).click();

		
		

	}

}
