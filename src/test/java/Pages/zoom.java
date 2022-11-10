package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class zoom extends AbstractClass{
	
	//Constructor
	public zoom(WebDriver driver) {
		this.driver=driver;
	}

	
	//Methods	
	public void ZoomOut(int a) throws AWTException {
		Robot robot = new Robot();
		for(int i=1; i<a; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyPress(KeyEvent.VK_CONTROL);
		}
	}
	
	public void ZoomIn() throws AWTException {
		Robot robot = new Robot();
		for(int i=1; i<5; i++) {		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyPress(KeyEvent.VK_ADD);
		}
	}	
}
