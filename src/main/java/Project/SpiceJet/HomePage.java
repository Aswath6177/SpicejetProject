package Project.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

   
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

  
    @FindBy(xpath = "//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa' and text()='check-in']")
    WebElement checkinfield;

    @FindBy(xpath = "//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa' and text()='flight status']")
    WebElement flightstatus;

    @FindBy(xpath = "//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa' and text()='manage booking']")
    WebElement managebokking;

   
    public void checkInField() {
        if (checkinfield.isDisplayed()) {
            System.out.println("Check-in field is visible and available on the page.");
            checkinfield.click(); 
        } else {
            System.out.println("Check-in field is not visible.");
        }
    }

    
    public void flightStatus() {
        if (flightstatus.isDisplayed()) {
            System.out.println("Flight Status field is visible and available on the page.");
            flightstatus.click(); 
        } else {
            System.out.println("Flight Status field is not visible.");
        }
    }

    // Method to validate and click on the Manage Booking field
    public void manageBooking() {
        if (managebokking.isDisplayed()) {
            System.out.println("Manage Booking field is visible and available on the page.");
            managebokking.click();         } else {
            System.out.println("Manage Booking field is not visible.");
        }
    }
}
