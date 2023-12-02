package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.HomePage;

public class LoginTest extends BaseTest {
	@Test
	public void loginToPhpTravels() {
		ExtentTest test = extent.createTest("TC-01-PHPTravels Login", "Checking the phptravels login functionality e2e");
		//*** Page Instantiations ***//
		HomePage home = new HomePage(driver, test);
		
		//*** Calling the Page Methods ***//
		home.goToHomePage() // Go to PHPtravels Homepage
			.goToLoginPage() // Go to Login Page
			.doLoginWithRemember("user@phptravels.com", "demouser"); // Login into phptravels
		
		String expectedTitle = "Dashboard - PHPTRAVELS";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			test.log(Status.PASS, "User logged in successfully");
		} else {
			test.log(Status.FAIL, "User login failed");
		}
	}
}
