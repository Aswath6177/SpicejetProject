package Project.SpiceJet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	static WebDriver driver;
    static HomePage page3;
	@BeforeTest
    public void openLink() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");  
        driver = new ChromeDriver(options);
        
        driver.get("https://www.spicejet.com/");
        CommonFunctions.waitForFixTime(2000);  
    }
	
	
	@Test(enabled = false)
	public void checkHomePageFields() {
		page3= new HomePage(driver);
		page3.checkInField();
		page3.flightStatus();
		page3.manageBooking();
	}
	
	   @AfterTest
	     public void tearDown() throws IOException {
	        
	         if (driver != null) {
	             driver.quit();
	         }
	         
	}
}
