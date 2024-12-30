package Project.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsSearch {
WebDriver driver;
	
	public FlightsSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//div[@data-testid='one-way-radio-button']")
	WebElement oneway;
	
	@FindBy (xpath="//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu' and @value='Delhi (DEL)']")
	WebElement from;
	
	@FindBy (xpath="//input[ @value='hi']")
	WebElement to;
	
	@FindBy (xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement searchflights;
	
	@FindBy (xpath="//div[text()='Mon, 6 Jan 2025']")
	WebElement date;
	
	
	//--------------------------------------
	
	@FindBy (xpath="//div[text()='round trip']")
	WebElement roundtrip;
	
	@FindBy (xpath="//div[text()='Select Date']")
	WebElement returndate;
	
	@FindBy (xpath="(//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/div/div[3]/div[2]/div[4]/div/div")
	WebElement datesend;
	
	
	
	public void oneWayClick() {
		oneway.click();
	}
	
	public void roundtripClick() {
		roundtrip.click();
	}
	public void fromEnter(String fromPlace) {
		
		from.sendKeys(fromPlace);
	}
	public void toEnter(String toPlace) {
		to.click();
		to.clear();
		to.sendKeys(toPlace);
		
	}
	
	public void dtateClick() {
		date.click();
	}
	public void returnDateClick() {
		
		returndate.click();
		datesend.click();
	}
	public void searchFlightsClick() {
		searchflights.click();
	}
}
