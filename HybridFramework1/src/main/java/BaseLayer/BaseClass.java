package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;

	public static void initialization() {
		// connect browser
		// UP casting
		driver = new ChromeDriver();

		// implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// maximize
		driver.manage().window().maximize();

		// deleteAllCookies
		driver.manage().deleteAllCookies();

		// open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}

