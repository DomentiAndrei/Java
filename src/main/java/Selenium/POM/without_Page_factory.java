package Selenium.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class without_Page_factory {

	WebDriver driver;
	
	
	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By loginButton = By.xpath("//input[@type='submit']");
	
	
	
	public without_Page_factory(WebDriver driver2) {
		this.driver = driver;
	}
	
	public void logFacebook(String userN, String passs) {
		
		
		driver.findElement(username).sendKeys("124");
		driver.findElement(loginButton).sendKeys("ewfer");
		driver.findElement(loginButton).click();
		
	}
	
	public void typeUserName(String usID) {
		driver.findElement(username).sendKeys(usID);
		
	}
	public void typeUserPass(String pasID) {
		driver.findElement(password).sendKeys(pasID);
		
	}
	public void click() {
		driver.findElement(loginButton).click();
	}
	
}


