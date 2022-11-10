package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class calculatorAppPage extends AbstractClass{
	
	//Locators
	By linkLogout = By.xpath("/html/body/nav/div/ul[2]/a");
	
	
	//Constructor
	public calculatorAppPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//Methods
	public void ClickLinkLogout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(linkLogout).click();
	}
}
