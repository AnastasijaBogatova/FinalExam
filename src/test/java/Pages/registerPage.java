package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class registerPage extends AbstractClass{
	
	//Locators
	By fieldUserName = By.id("username");
	By noteNameError = (By.id("username.errors"));
	By fieldPassword = By.id("password");
	By notePasswordError = (By.id("password.errors"));
	By fieldPasswordConfirm = By.id("passwordConfirm");
	By buttonRegister = By.xpath("/html/body/div/form/button");
	
	
	//Constructor
	public registerPage(WebDriver driver) {
		this.driver=driver;
	}

	
	//Methods		
	public void EnterCredentials(String name, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(fieldUserName).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(fieldPassword).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(fieldPasswordConfirm).sendKeys(password);
	}	
	
	public void ClickButtonRegister() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(buttonRegister).click();
	}
	
	public void IsNameErrorOK() {
		String note = driver.findElement(noteNameError).getText();
		Assert.assertEquals("Šį laukelį būtina užpildyti. Privaloma įvesti nuo 3 iki 32 simbolių", note);
	}
	
	public void IsPasswordErrorOK() {
		String note = driver.findElement(notePasswordError).getText();
		assertEquals("Šį laukelį būtina užpildyti. Privaloma įvesti bent 3 simbolius", note);
		System.out.println("Testas pavyko(negative).Vartotojas nepriregistravo nes neatitiko registracijos parametru "  +  note);
	}
	

	
	public void CleanFields() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(fieldUserName).clear();
		driver.findElement(fieldPassword).clear();
		driver.findElement(fieldPasswordConfirm).clear();
	}
}
