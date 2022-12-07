package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addNewBookingPage {
	private WebDriver driver ;
	JavascriptExecutor jse = (JavascriptExecutor)driver;


	private By customer = By.xpath("//input[@data-placeholder='Customer']");
	private By supplier = By.xpath("//input[@data-placeholder='Supplier']");
	private By confirmBtn = By.xpath("//button[@color='primary']");

	public addNewBookingPage(WebDriver driver) {
		this.driver= driver ;
	}


	public void enterCustomer(String cust) throws InterruptedException {
	WebElement custName =	driver.findElement(customer);
	custName.sendKeys(cust);
	Thread.sleep(2000);
	custName.sendKeys(Keys.ARROW_DOWN);
	custName.sendKeys(Keys.ENTER);

	}

	public void enterSupplier(String sup) throws InterruptedException {
		WebElement supplierName = driver.findElement(supplier);
		supplierName.sendKeys(sup);
		Thread.sleep(2000);
		supplierName.sendKeys(Keys.ARROW_DOWN);
		supplierName.sendKeys(Keys.ENTER);
		
	}

	public void clickConfirm() throws InterruptedException {
		driver.findElement(confirmBtn).click();
		Thread.sleep(8000);
		//jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
}
