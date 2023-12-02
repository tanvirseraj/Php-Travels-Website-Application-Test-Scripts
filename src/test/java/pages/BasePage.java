package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
//import org.openqa.selenium.WebElement;

public class BasePage {
	public WebDriver driver;
	public ExtentTest test;
	
	// Constructor
	public BasePage(WebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		this.test = test;
	}
	
	// Method for Write Text
	public void writeText(By element, String text)
	{
		driver.findElement(element).sendKeys(text); // Way-1
		
		//WebElement textField = driver.findElement(element);
		//textField.sendKeys(text); // Way-2
	}
	
	// Method to Click
	public void click(By element)
	{
		driver.findElement(element).click();
	}
	
	// Method to Read Text
	public String readText(By element)
	{
		return driver.findElement(element).getText();
	}
}
