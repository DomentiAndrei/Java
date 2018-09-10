package Selenium.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class without_Page_factory_cont {
	@Test
	public void face() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com");
		
		without_Page_factory callMethod = new without_Page_factory(driver);
		callMethod.click();
		
		driver.quit();
		
		
		
		
		
	}
}
