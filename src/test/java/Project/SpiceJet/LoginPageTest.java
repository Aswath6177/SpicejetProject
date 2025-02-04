package Project.SpiceJet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {

	static WebDriver driver;
    static LoginPage page1;
	
    @BeforeTest
    public void openLink() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");  
        driver = new ChromeDriver(options);
        
        driver.get("https://www.spicejet.com/");
        CommonFunctions.waitForFixTime(2000);  
    }
     @Test
	public void LoginPageFunction() throws InterruptedException {
		page1=new LoginPage(driver);

		CommonFunctions.waitForFixTime(3000);
		page1.loginClickFromHomePage();
		CommonFunctions.waitForFixTime(3000);
		page1.phoneNumberClick("7010896181");
		page1.passwordClick("Aswath$989");
		CommonFunctions.waitForFixTime(3000);
		page1.loginClick();
		CommonFunctions.waitForFixTime(7000);
	}
     
     @AfterTest
     public void tearDown() throws IOException {
        
         if (driver != null) {
             driver.quit();
         }
         
}
}
