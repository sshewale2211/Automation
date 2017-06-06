package appModules;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjects.AB_Register_Page;
import utility.ExcelUtils;

// Now this method does not need any arguments

public class AB_Register_Action {

	public static void Execute(WebDriver driver) throws Exception {

		// This is to get the values from Excel sheet, passing parameters (Row
		// num &amp; Col num)to getCellData method
		try {

			String F_Name = ExcelUtils.getCellData(1, 1);
			AB_Register_Page.F_Name(driver).sendKeys(F_Name);

			String L_Name = ExcelUtils.getCellData(1, 2);
			AB_Register_Page.L_Name(driver).sendKeys(L_Name);

			String Address = ExcelUtils.getCellData(1, 3);
			AB_Register_Page.Address(driver).sendKeys(Address);

			String Email = ExcelUtils.getCellData(1, 4);
			AB_Register_Page.Email(driver).sendKeys(Email);

			String Phone = ExcelUtils.getCellData(1, 5);
			AB_Register_Page.Phone(driver).sendKeys(Phone);

			AB_Register_Page.Gender(driver).click();

			AB_Register_Page.Hobbies(driver);

			String Skill = ExcelUtils.getCellData(1, 6);
			AB_Register_Page.Skill(driver).selectByVisibleText(Skill);

			String Country = ExcelUtils.getCellData(1, 7);
			AB_Register_Page.Country(driver).selectByVisibleText(Country);

			String DOB_Year = ExcelUtils.getCellData(1, 8);
			AB_Register_Page.DOB_Year(driver).selectByVisibleText(DOB_Year);

			String DOB_Month = ExcelUtils.getCellData(1, 9);
			AB_Register_Page.DOB_Month(driver).selectByVisibleText(DOB_Month);

			String DOB_Day = ExcelUtils.getCellData(1, 10);
			AB_Register_Page.DOB_Day(driver).selectByVisibleText(DOB_Day);

			String Pass = ExcelUtils.getCellData(1, 11);
			AB_Register_Page.Pass(driver).sendKeys(Pass);

			String Conf_Pass = ExcelUtils.getCellData(1, 12);
			AB_Register_Page.Conf_Pass(driver).sendKeys(Conf_Pass);
			
			AB_Register_Page.Image(driver).sendKeys("E:\\profilepic.jpg");

			AB_Register_Page.Submit_btn(driver).click();

			ExcelUtils.setCellData("Pass", 1, 13);

		} catch (Exception e) {
			ExcelUtils.setCellData("Fail", 1, 13);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy
			// somewhere
			FileUtils.copyFile(scrFile,
					new File("E:\\Selenium_New\\DATDataDriven\\DATDataDriven\\src\\screenShot\\screenshot.png"));
			System.out.println("Exception Found :-" + e);
		}

	}

}