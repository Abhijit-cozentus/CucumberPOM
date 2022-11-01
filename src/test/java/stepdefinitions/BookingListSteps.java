package stepdefinitions;



import java.util.List;
import java.util.Map;

import Pages.BookingListPage;
import Pages.LoginPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookingListSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private BookingListPage bookingListPage;

	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("Username");
		String password = credList.get(0).get("Password");
		DriverFactory.getDriver().get("//ewlstaging.azurewebsites.net/unauth/login");
		loginPage.doLogin(userName, password);

	}

	@Given("user is on booking list page")
	public void user_is_on_booking_list_page() {
		System.out.println("user is on booking list page ");
	}

	@Then("{double} button is vissible on screen")
	public void button_is_vissible_on_screen(Double double1) {

	}

	@Then("user clicks on {double} button")
	public void user_clicks_on_button(Double double1) {

	}

	@Then("user navigates to New booking page")
	public void user_navigates_to_new_booking_page() {

	}


}
