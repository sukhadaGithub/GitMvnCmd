package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class LoginTest extends BaseClass {
	
	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}


}
