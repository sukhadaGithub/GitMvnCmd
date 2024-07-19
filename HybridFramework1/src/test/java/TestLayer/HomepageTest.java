package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class HomepageTest extends BaseClass
{
	
	@Test(priority = 1)
	public void validateUserOnHomePage() {

		String actualResult = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
		Assert.assertEquals(actualResult, "Dashboard");
	}

	@Test(priority = 2)
	public void validateTitle() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(priority = 3)
	public void validateUrl() {
		String actualUrl = driver.getCurrentUrl();
		boolean actualResult = actualUrl.contains("orangehrm");
		Assert.assertTrue(actualResult);
	}

	@Test(priority = 4)
	public void validateLogo() {
		boolean actualLogo = driver.findElement(By.xpath("//img")).isDisplayed();
		Assert.assertTrue(actualLogo);
	}


}
