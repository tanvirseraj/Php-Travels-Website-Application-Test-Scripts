package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class RegistrationTest extends BaseTest {
	@Test
	public void registerInPhpTravels()
	{
		// Page Instantiations
		HomePage home = new HomePage(driver, test);
		
		// Calling the page methods
		home.goToHomePage() // Go to phptravels homepage
			.goToRegistrationPage() // Go to the registration page
			.doRegistration("John", "Doe", "01023445566", "john@example.com", "john1234");
		
	}
}
