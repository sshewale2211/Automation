package pageObjects;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AB_Register_Page {

	private static WebElement element = null;

	public static WebElement F_Name(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));

		return element;

	}

	public static WebElement L_Name(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));

		return element;

	}

	public static WebElement Address(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));

		return element;

	}

	public static WebElement Email(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='eid']/input"));

		return element;

	}

	public static WebElement Phone(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));

		return element;

	}

	public static WebElement Gender(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));

		return element;

	}

	public static WebElement Hobbies(WebDriver driver) {

		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement element : els ) {
		    if ( !element.isSelected() ) {
		    element.click();
		    }
		}

		return element;

	}


	public static Select Skill(WebDriver driver) {

		Select element = new Select(driver.findElement(By.id("Skills")));

		return element;

	}

	public static Select Country(WebDriver driver) {

		Select element = new Select(driver.findElement(By.id("countries")));

		return element;

	}

	public static Select DOB_Year(WebDriver driver) {

		Select element = new Select(driver.findElement(By.id("yearbox")));

		return element;

	}

	public static Select DOB_Month(WebDriver driver) {

		Select element = new Select(driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select")));

		return element;

	}

	public static Select DOB_Day(WebDriver driver) {

		Select element = new Select(driver.findElement(By.id("daybox")));

		return element;

	}

	public static WebElement Pass(WebDriver driver) {

		element = driver.findElement(By.id("firstpassword"));

		return element;

	}

	public static WebElement Conf_Pass(WebDriver driver) {

		element = driver.findElement(By.id("secondpassword"));

		return element;

	}
	
	public static WebElement Image(WebDriver driver) {

		element = driver.findElement(By.id("imagesrc"));

		return element;

	}

	public static WebElement Submit_btn(WebDriver driver) {

		element = driver.findElement(By.id("submitbtn"));

		return element;

	}

}
