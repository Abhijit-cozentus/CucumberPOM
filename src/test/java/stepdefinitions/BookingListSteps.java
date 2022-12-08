package stepdefinitions;



import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Pages.BookingListPage;
import Pages.LoginPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookingListSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private BookingListPage bookingListPage;

	private static String actualId;



	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		DriverFactory.getDriver().get("https://ewlstaging.azurewebsites.net/unauth/login");
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("Username");
		String password = credList.get(0).get("Password");
		bookingListPage=loginPage.doLogin(userName, password);
		Thread.sleep(6000);

	}

	@Given("user is on booking list page")
	public void user_is_on_booking_list_page() throws InterruptedException {
		bookingListPage.clickBookings();
		bookingListPage.clickBookingList();
		System.out.println("user is on booking list page ");
		Thread.sleep(5000);



	}

	@Then("add new booking button is vissible on screen")
	public void add_new_booking_button_is_vissible_on_screen() {
		boolean btn = bookingListPage.newBtnDisplay();
		System.out.println("Add new booking button is vissible: " + btn);

	}

	@Then("user clicks on add new booking button")
	public void user_clicks_on_add_new_booking_button () throws InterruptedException {
		bookingListPage.clicknNewBookingBtn();
		Thread.sleep(5000);
	}


	@Then("user enters {string} booking id on search bar")
	public void user_enters_booking_id_on_search_bar(String Id) throws InterruptedException {
		bookingListPage.enterSearchvalue(Id);
		Thread.sleep(5000);
		Assert.assertEquals(true, false);
	}


	@Then("validate Booking id {string}")
	public void validate_booking_id(String expectedId) {
		actualId= bookingListPage.checkBookingID();
		Assert.assertEquals(expectedId, actualId);


	}




}
