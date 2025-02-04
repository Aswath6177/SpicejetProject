package Project.SpiceJet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlighsSearchTest {
	public class FlighTicketsBookTest {
		static WebDriver driver;
	    static FlightsSearch page2;
	    
	    @BeforeTest
	    public void openLink() throws InterruptedException {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
	        
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");  
	        driver = new ChromeDriver(options);
	        
	        driver.get("https://www.spicejet.com/");
	        CommonFunctions.waitForFixTime(2000);  
	    }
	    

		@Test(priority = 0)
		public void searchFlightsOneWay() throws InterruptedException {
			page2 = new FlightsSearch(driver);
			//page2.oneWayClick();
			page2.fromEnter("Delhi");
			CommonFunctions.waitForFixTime(3000);
			page2.toEnter("Bengluru");
			page2.dtateClick();
			page2.searchFlightsClick();
			CommonFunctions.waitForFixTime(7000);
		}
		@Test(enabled = false)
		public void searchFlightsRoundTrip() {
			
			page2 = new FlightsSearch(driver);
			page2.roundtripClick();
			page2.fromEnter("Coimbatore");
			page2.toEnter("Chennai");
			page2.dtateClick();
			page2.returnDateClick();
			page2.searchFlightsClick();
		}
	    
	    
	    
	    
	    
	    @AfterTest
	    public void tearDown() throws IOException {
	       
	        if (driver != null) {
	            driver.quit();
	        }
	        
	}
	}

}
