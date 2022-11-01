package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingListPage {
	
	
	private WebDriver driver ;
	private By newBookingBtn = By.xpath("/html/body/app-root/block-ui/app-main-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-booking-list/mat-card/mat-card-content/div[1]/div/button");
	private By booking = By.xpath("//*[@id=\"snav\"]/div/app-sidebar/div/mat-nav-list/mat-list-item[3]/span/a");
	private By bookingList = By.linkText("Booking List");
	public BookingListPage(WebDriver driver) {
		this.driver = driver ;
		
	}
	
	public void goToBookingList() {
		driver.findElement(booking).click();
		driver.findElement(bookingList).click();
		
	}
    
	public void clickNewBtnDisplay() {
		
		
	}
	public void clicknNewBookingBtn() {
		driver.findElement(newBookingBtn);
		
	}
	
}
