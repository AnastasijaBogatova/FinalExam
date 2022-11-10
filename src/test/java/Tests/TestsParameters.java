package Tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestsParameters {
	
	protected static WebDriver driver;
	
	@BeforeTest
	public static void SetUp() throws AWTException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost:8080/prisijungti");
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();	
	}	
}
