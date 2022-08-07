package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver; //initialize webdriver
	
	
	@BeforeSuite 
	
	public static void SetDriver() {
		
		WebDriverManager.chromedriver().setup();
		// web driver a chrome broser innitialize & setup korlam
		
		driver = new ChromeDriver();
		//driver ke bollam chrome driver calanur jonne
		
	}
	
	
	/*er maddone ensure korlam je sob test case jeno chrome diye suru kore*/
	
	
	

	@AfterSuite
	
	public static void close() {
		
		driver.close();
		
		//method quits the driver, closing every associated window
		
		//driver.quit();
		//""method closes the currently focused window, quitting the driver if the current window is the only open window.

	}
	
	/* tarpor close korlm*/
}
