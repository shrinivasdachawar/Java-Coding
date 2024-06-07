package pom_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	

	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement button;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApp() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		username.sendKeys("Admin");

		password.sendKeys("admin123");
		button.click();

	}

	public boolean getUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("dashboard")) {
			return true;
		} else {
			return false;
		}
	}

}