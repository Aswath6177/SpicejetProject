package Project.SpiceJet;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUpPageTest {
    public static SignUpPage page;
    public static WebDriver driver;

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
    public void signUpPage() throws InterruptedException {
        page = new SignUpPage(driver);
        
        page.signUpClick();
        CommonFunctions.waitForFixTime(3000);
        
        page.titleClick();
        page.firstNameClick("Aswath");
        page.lastNameClick("Saravana shankar");
        page.dobClick();  
        page.phoneNumberClick("7010896182");
        page.passWordClick("aswath$989");
        
        CommonFunctions.waitForFixTime(3000);
        
        page.confirmPassWordClick("aswath$989");
    }

    @AfterTest
    public void tearDown() throws IOException {
       
        if (driver != null) {
            driver.quit();
        }
        
       
    }
}
