package factory;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {


	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/** This method is used to initilize the thradlocal driver on the basis of given browser
	 *
	 * @param browser
	 * @return
	 */

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is:" + browser);

		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please pass correct browser value: ");
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		return getDriver();
	}

	/**
	 * this is used to get the driver with threadlocal
	 * @return
	 */
	public static synchronized WebDriver getDriver() {

		return tlDriver.get();

	}
}
