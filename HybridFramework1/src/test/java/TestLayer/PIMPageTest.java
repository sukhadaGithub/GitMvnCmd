package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class PIMPageTest extends BaseClass {
	
	private static String employeeId;

	@Test(priority = 1)
	public void validateUrl() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		String actualUrl = driver.getCurrentUrl();
		boolean actualResult = actualUrl.contains("pim");
		Assert.assertEquals(actualResult, true);
	}

	@Test(priority = 2)
	public void validateNewEmployee() {
		driver.findElement(By.xpath("//button[text()='Add Employee']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ashish");
		driver.findElement(By.name("lastname")).sendKeys("Shah");
		employeeId = driver.findElement(By.xpath("//")).getAttribute("value");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}

	

}
