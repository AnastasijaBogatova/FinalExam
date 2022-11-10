package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage extends AbstractClass{
	
	//Locators
	By fieldUserName = By.name("username");
	By fieldPassword = By.name("password");
	By buttonLogin = By.xpath("/html/body/div/form/div/button");
	By noteError = (By.xpath("//*[text()='Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi']"));
	By linkRegister = By.xpath("/html/body/div/form/div/h4/a");

	
	//Constructor
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}

	
	//Methods
	public void EnterCredentials(String name, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(fieldUserName).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(fieldPassword).sendKeys(password);
	}
	
	public void ClickButtonLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(buttonLogin).click();
	}
	
	public void IsErrorOK() {
		String note = driver.findElement(noteError).getText();
		Assert.assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", note);
	}
	
	public void CleanFields() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(fieldUserName).clear();
		driver.findElement(fieldPassword).clear();	
	}
	
	public void ClickLinkRegister() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(linkRegister).click();
	}
}
