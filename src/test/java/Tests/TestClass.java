package Tests;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pages.calculatorAppPage;
import Pages.loginPage;
import Pages.registerPage;


public class TestClass extends TestsParameters{	
	
	@Test
	public void registerWithInvalidData() throws InterruptedException, AWTException {

		loginPage log = new loginPage(driver);
		registerPage reg = new registerPage(driver);

		log.ClickLinkRegister();
		reg.EnterCredentials("ABO", "01");
		reg.ClickButtonRegister();		
	}

	@Test
	public void register() throws InterruptedException, AWTException {

		loginPage log = new loginPage(driver);
		registerPage reg = new registerPage(driver);
		calculatorAppPage  calc = new calculatorAppPage(driver);

		log.ClickLinkRegister();
		reg.EnterCredentials("AB", "0101");
		reg.ClickButtonRegister();	
		calc.ClickLinkLogout();
		
	}
	
	@Test
	public void loginWithInvalidData() throws InterruptedException, AWTException {

		loginPage log = new loginPage(driver);
		
		log.EnterCredentials("User123", "0100");
		log.ClickButtonLogin();		
	}
	
	
	@Test
	public void login() throws InterruptedException, AWTException {

		loginPage log = new loginPage(driver);
		calculatorAppPage  calc = new calculatorAppPage(driver);
		
		log.EnterCredentials("KSU", "0101");
		log.ClickButtonLogin();	
		calc.ClickLinkLogout();
	}
	
	
	@Test
	public void logout() throws InterruptedException, AWTException {
		
		loginPage log = new loginPage(driver);
		calculatorAppPage  calc = new calculatorAppPage(driver);
		
		log.EnterCredentials("KSU", "0101");
		log.CleanFields();
		log.EnterCredentials("Test", "1234");
		log.ClickButtonLogin();
		calc.ClickLinkLogout();			
	}
}
