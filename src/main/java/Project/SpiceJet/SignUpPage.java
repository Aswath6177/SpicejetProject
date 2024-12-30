package Project.SpiceJet;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
WebDriver driver;


public SignUpPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy (xpath="//div[@dir='auto' and text()='Signup']")
WebElement Signup;

@FindBy (xpath="//select[@class='form-control form-select ']")
WebElement title;

@FindBy (xpath="//option[text()='Mr']")
WebElement titleselection;


@FindBy(id = "first_name")
WebElement firstname;
@FindBy(id = "last_name")
WebElement lastname;

@FindBy(id = "dobDate")
WebElement dob;


@FindBy(xpath = "//div[text()='26']")
WebElement date;

@FindBy (xpath="//input[@class=' form-control']")
WebElement phonenumber;

@FindBy(xpath = "//input[@id='email_id']")
WebElement emailid;

@FindBy(xpath = "//input[@id='new-password']")
WebElement password;
@FindBy(id = "c-password")
WebElement confirmpassword;


public void signUpClick() throws InterruptedException {
	Signup.click();
	
}



public void titleClick() {
	Set<String> allWindowHandles = driver.getWindowHandles();
    for (String windowHandle : allWindowHandles) {
    	driver.switchTo().window(windowHandle);
    	String currentWindowTitle = driver.getTitle();
        if (currentWindowTitle.equals("SpiceClub - The frequent flyer program of SpiceJet")) {
        	title.click();
        	titleselection.click();
        } }
        }
	
public void dobClick() {
	dob.click();
	dob.sendKeys("06/26/2000");
	date.click();
}
public void firstNameClick(String name) {
	
	firstname.sendKeys(name);
}
public void lastNameClick(String name) {
	
	lastname.sendKeys(name);
}
public void phoneNumberClick(String num) {
	
	phonenumber.sendKeys(num);
}
public void emailIdClick(String email) {
	
	emailid.click();
	emailid.sendKeys(email);
}
public void passWordClick(String pass) {
	
	password.sendKeys(pass);
}
public void confirmPassWordClick(String pass) {
	
	confirmpassword.sendKeys(pass);
}

}