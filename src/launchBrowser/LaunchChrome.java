package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Learning\\ecplise-selenium\\1stSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://www.techfios.com/#");

		driver.manage().window().maximize();

		// identify user name and insert value
		// driver.findElement(By.cssSelector("dropdown")).click();
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Your-Name");

	}
}
