package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC001_LocatorFinding extends DriverSetup{
	String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
	

	@Test
	
	public void locator() throws InterruptedException {
		
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //jekuno error deyar age 5 minit wait korar method
		driver.manage().window().maximize();  //browser maximize korar method
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Porag");
		Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Porag");
		//driver.findElement(By.xpath("//tagname[@attribute="value]"))
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("porag@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("01712272846");

		
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01712272846");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);

		
	}


	


	
	}
	