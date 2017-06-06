package appModules;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjects.AA_Skip_Page;

// Now this method does not need any arguments

public class AA_Skip_Action {

	public static void Execute(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
		try {			
			
			AA_Skip_Page.Login(driver).click();			
			
		} catch (Exception e) {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("E:\\Selenium_New\\DATDataDriven\\DATDataDriven\\src\\screenShot\\screenshot.png"));
			System.out.println("Exception Found :-"+e);
		}
		
		
	}

}