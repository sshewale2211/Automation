package pageObjects;

import org.openqa.selenium.*;

public class AA_Skip_Page {

	private static WebElement element = null;
		
	public static WebElement Login(WebDriver driver) {

		element = driver.findElement(By.id("enterimg"));

		return element;

	}
	
	
	
	
	
	

	
}
