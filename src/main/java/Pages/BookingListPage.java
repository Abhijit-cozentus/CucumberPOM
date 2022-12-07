package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BookingListPage {


	private WebDriver driver ;

	private By newBookingBtn = By.xpath("/html/body/app-root/block-ui/app-main-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-booking-list/mat-card/mat-card-content/div[1]/div/button");
	private By booking = By.xpath("//span[contains(text(),'Bookings')]");
	private By bookingList = By.linkText("Booking List");
	private By searchBar =By.xpath("//input[@data-placeholder='Ref, Agent Ref, POL, PO, Supplier & Customer']");
	private By bookingId = By.cssSelector("body app-root mat-cell:nth-child(7)");




	public BookingListPage(WebDriver driver) {
		this.driver = driver ;

	}



	public void  clickBookings() {
		driver.findElement(booking).click();
	}
	
	public void clickBookingList() {
		driver.findElement(bookingList).click();
		
	}

	public boolean newBtnDisplay() {
		Boolean addNewbookingbtn =	driver.findElement(booking).isDisplayed();
		return addNewbookingbtn;


	}
	public void clicknNewBookingBtn() {
		driver.findElement(newBookingBtn).click();

	}

	public void enterSearchvalue(String searchId) throws InterruptedException {
		WebElement check = driver.findElement(searchBar);
		check.click();
		Thread.sleep(1000);
		check.sendKeys(searchId);
		check.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	public String checkBookingID() {
		String bookingValue =driver.findElement(bookingId).getText();
		return bookingValue;
	}


}
