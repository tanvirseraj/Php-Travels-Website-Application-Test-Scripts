package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class RegistrationPage extends BasePage {
	
	// Constructor
	public RegistrationPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	//*** Page Web Elements ***//
	By firstNameBy = By.name("first_name");
	By lastNameBy = By.name("last_name");
	By phoneBy = By.name("phone");
	By emailBy = By.name("email");
	By passwordBy = By.name("password");
	//By userTypeDropdownBy = By.id("select2-account_type-container");
	By userTypeDropdownBy = By.xpath("//span[@class=\"select2-selection select2-selection--single\"]");
	By userTypeBy = By.id("select2-account_type-result-ixuw-customers");
	By regButtonBy = By.id("button");
	
	//*** Page Methods ***//
	public RegistrationPage doRegistration(String firstName, String lastName, String phone,
											String email, String password) {
		// Enter the first name
		writeText(firstNameBy, firstName);
		// Enter the last name
		writeText(lastNameBy, lastName);
		// Enter the phone number
		writeText(phoneBy, phone);
		// Enter the email
		writeText(emailBy, email);
		// Enter the password
		writeText(passwordBy, password);
		// Click on the UserType Dropdown
		click(userTypeDropdownBy);
		// Select the user type
		//click(userTypeBy);
		// Clicking on Signup button
		//click(regButtonBy);
		
		return this;
		
	}
	
}
