package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPage extends BasePage {
	// Constructor
	public LoginPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	//*** Page Web Elements ***//
	By emailBy = By.name("email");
	By passwordBy = By.name("password");
	By rememberMeBy = By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label");
	By loginButtonBy = By.xpath("//div[@class=\"btn-box pt-3 pb-4\"]/button");
	
	//*** Page Methods ***//
	// Do Login without rememberMe
	public LoginPage doLogin(String email, String password) {
		// Enter the email
		test.log(Status.INFO, "Entering the email address");
		writeText(emailBy, email);
		test.log(Status.PASS, "email address entered successfully");
		// Enter the Password
		writeText(passwordBy, password);
		// Click on Login Button
		click(loginButtonBy);
		return this;
	}
	
	// Do Login with rememberMe
	public LoginPage doLoginWithRemember(String email, String password) {
		// Enter the email
		test.log(Status.INFO, "Entering the email address");
		writeText(emailBy, email);
		test.log(Status.PASS, "email address entered successfully");
		// Enter the Password
		writeText(passwordBy, password);
		// Check the remember me
		click(rememberMeBy);
		// Click on Login Button
		click(loginButtonBy);
		return this;
	}
}
