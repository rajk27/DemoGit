package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	public WebDriver driver;
	@Test(priority=1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void teardown() {
		driver.quit();
	}
	
}
