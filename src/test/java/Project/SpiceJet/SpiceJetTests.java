package Project.SpiceJet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SpiceJetTests {
	static WebDriver driver;
	static SignUpPage page;
	static LoginPage page1;
	static FlightsSearch page2;
	static HomePage page3;
	static BookTickets page4;
	@BeforeTest
	public void openLink() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		CommonFunctions.windowMaximize(driver);
		
		CommonFunctions.waitForFixTime(2000);
	
	
	
}
	@Test(enabled = false)
public void signUpPage() throws InterruptedException {
		page=new SignUpPage(driver);
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
	
	
	@Test(priority = 0)
	public void LoginPageFunction() throws InterruptedException {
		page1=new LoginPage(driver);
//		CommonFunctions.navigateToUrl(driver,"//www.spicejet.com/" );
		CommonFunctions.waitForFixTime(3000);
		page1.loginClickFromHomePage();
		CommonFunctions.waitForFixTime(3000);
		page1.phoneNumberClick("7010896181");
		page1.passwordClick("Aswath$989");
		CommonFunctions.waitForFixTime(3000);
		page1.loginClick();
		CommonFunctions.waitForFixTime(7000);
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
	@Test(enabled = false)
	public void checkHomePageFields() {
		page3= new HomePage(driver);
		page3.checkInField();
		page3.flightStatus();
		page3.manageBooking();
	}
	
//	@AfterTest
//	public void closeBrowser() throws InterruptedException {
//		CommonFunctions.waitForFixTime(3000);
//		CommonFunctions.quitBrowser(driver);
//	}
}