package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HomePage extends BasePage {
	
	// Constructor
	public HomePage(WebDriver driver, ExtentTest test)
	{
		super(driver, test);
	}
	
	//***** Page Variables ***//
	String baseURL = "https://phptravels.net";
	
	//**** Page Web Elements ****//
	By accountDropDown = By.id("ACCOUNT");
	By customerLoginButton = By.xpath("(//a[@href=\"https://phptravels.net/login\"])[1]");
	By customerRegistrationButton = By.xpath("//a[@href=\"https://phptravels.net/signup\"]");
	
	//*** Page Methods ***//
	// Go to Homepage
	public HomePage goToHomePage()
	{
		test.log(Status.INFO, "Browser Launched Successfully");
		driver.get(baseURL); // Open the Homepage
		test.log(Status.INFO, "PHPTravels landing page opened Successfully");
		return this; // Return current object
	}
	
	// Go to the Login Page
	public LoginPage goToLoginPage()
	{
		click(accountDropDown);
		test.log(Status.INFO, "Clicking on login button");
		click(customerLoginButton);
		test.log(Status.PASS, "Login button clicked successfully");
		return new LoginPage(driver, test);
	}
	
	// Go to the Registration Page
	public RegistrationPage goToRegistrationPage()
	{
		click(accountDropDown);
		click(customerRegistrationButton);
		return new RegistrationPage(driver, test);
	}
}
