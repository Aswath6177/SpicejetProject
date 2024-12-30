package Project.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTickets {
	
	WebDriver driver;
	
	public BookTickets(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement continueBooking;
	
	@FindBy (xpath = "//div[text()='I am flying as the primary passenger']")
	WebElement clickonprimarypassenger;
	
	@FindBy (xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement clickonprimarypassenger1;
	
	@FindBy (xpath = "//div[@data-testid='add-ons-continue-footer-button']")
	WebElement clickonprimarypassenger2;
	
	
	public void continueBookingclick() {
		continueBooking.click();
	}
	public void clickOnPrimaryPassenger() {
		clickonprimarypassenger.click();
	}
	public void clickOnPrimaryPassengerLast() {
		clickonprimarypassenger1.click();
	}
	public void clickOnPrimaryPassengerLast2() {
		clickonprimarypassenger2.click();
	}
}
