package Project.SpiceJet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	
	
public static void waitForFixTime(int time) throws InterruptedException {
	Thread.sleep(time);
}

public static void windowMaximize(WebDriver driver) {
	driver.manage().window().maximize();
}
public static void navigateBack(WebDriver driver) {
	driver.navigate().back();
}
public static void navigateToUrl(WebDriver driver, String url) {
	driver.navigate().to(url);
}
public static void aleartacccept(WebDriver driver) {
	Alert alert = driver.switchTo().alert();
	alert.accept();
}
public static void closeBrowser(WebDriver driver) {
	driver.close();
}
public static void quitBrowser(WebDriver driver) {
	driver.quit();
}
}
