package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.PropertyManager;

public class BaseTest {
	public WebDriver driver;
	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeClass
	public void setup() throws IOException {
		PropertyManager property = new PropertyManager();
		String browser = property.getKeyValue("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\test\\java\\binaries\\chromedriver.exe");
			// Instantiating the chrome driver
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\java\\binaries\\geckodriver.exe");
			// Instantiating the chrome driver
			driver = new FirefoxDriver();
		}
		
		// maximizing the browser window
		driver.manage().window().maximize();
		
		sparkReporter = new ExtentSparkReporter("extent-reports/testReport.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	
	@AfterClass
	public void teardown() {
		extent.flush();
		//driver.quit();
	}
}
