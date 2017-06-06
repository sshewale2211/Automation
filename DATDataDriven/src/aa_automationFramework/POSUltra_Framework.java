package aa_automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.Constant;
import utility.ExcelUtils;
import appModules.AA_Skip_Action;
import appModules.AB_Register_Action;

public class POSUltra_Framework {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		// This is to open the Excel file. Excel path, file name and the sheet
		// name are parameters to this method.

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_New\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get(Constant.URL);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Skip");
		AA_Skip_Action.Execute(driver);

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Register");
		AB_Register_Action.Execute(driver);
		// driver.quit();

	}

}