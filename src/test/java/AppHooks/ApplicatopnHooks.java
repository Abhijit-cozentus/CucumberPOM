package AppHooks;

import java.util.Properties;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class ApplicatopnHooks {

	private DriverFactory driverFactory ;
	private WebDriver driver ;
	private ConfigReader configReader ;
	Properties prop;

	@Before (order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

	}

	@Before (order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver =driverFactory.init_driver(browserName);

	}

	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order=1)
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
			//take screenshot
//			String sceenshotName = scenario.getName().replaceAll(" ", "_");
//			byte [] scourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(scourcePath, "Image/jpg", sceenshotName);
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[]source = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "Image/jpg", "screenshot");
			

		}

	}
	


}



