package Project.SpiceJet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlighTicketsBookTest {
	static WebDriver driver;
    static BookTickets page4;
    
    @BeforeTest
    public void openLink() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");  
        driver = new ChromeDriver(options);
        
        driver.get("https://www.spicejet.com/");
        CommonFunctions.waitForFixTime(2000);  
    }
    
    @Test(priority = 1)
	public void bookTickets() throws InterruptedException {
		page4 = new BookTickets(driver);
		page4.continueBookingclick();
		CommonFunctions.waitForFixTime(10000);
		page4.clickOnPrimaryPassenger();
		page4.clickOnPrimaryPassengerLast();
		CommonFunctions.waitForFixTime(7000);
		page4.clickOnPrimaryPassengerLast2();
		
	}
    
    
    
    
    
    @AfterTest
    public void tearDown() throws IOException {
       
        if (driver != null) {
            driver.quit();
        }
        
}
}
