package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


	private WebDriver driver ;

	//Locators
	private By username = By.xpath("//*[@id=\"mat-input-0\"]");
	private By password = By.xpath("//*[@id=\"mat-input-1\"]");
	private By loginBtn = By.xpath("//button[@type='submit']");

	//Constructer of the page:
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	//Page actions :features(behaviour) of the page the form of methods:
	public String getPageTitle() {
		return   driver.getTitle();

	}

	public void enterUserName(String Username) {
		driver.findElement(username).sendKeys(Username);

	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();


	}

	public BookingListPage doLogin(String userid,String pwd) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new BookingListPage(driver);

	}


}
