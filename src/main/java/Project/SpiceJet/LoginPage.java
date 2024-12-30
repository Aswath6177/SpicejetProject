package Project.SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (xpath="//div[@dir='auto' and text()='Login']")
	WebElement login;
	

	@FindBy (xpath="//input[@type='number']")
	WebElement phonenumber;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy (xpath="//div[@data-testid='login-cta']")
	WebElement loginClick;
	
	
	public void loginClickFromHomePage() {
		login.click();
	}
	
	public void phoneNumberClick(String number) {
		phonenumber.sendKeys(number);
	}
	
	public void  passwordClick(String pass) {
		password.sendKeys(pass);
	}
	
	public void loginClick() {
		loginClick.click();
	}
}
