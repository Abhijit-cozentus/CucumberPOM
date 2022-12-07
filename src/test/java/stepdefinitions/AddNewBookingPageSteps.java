package stepdefinitions;

import Pages.addNewBookingPage;
import factory.DriverFactory;
import io.cucumber.java.en.Then;

public class AddNewBookingPageSteps {
	
	
	private addNewBookingPage addBookingPage = new addNewBookingPage(DriverFactory.getDriver());

	
	@Then("enter customer name {string} and customer name {string}")
	public void enter_customer_name_and_customer_name(String custName, String supName) throws InterruptedException {
		addBookingPage.enterCustomer(custName);
		addBookingPage.enterSupplier(supName);
	}

	@Then("click on confirm button")
	public void click_on_confirm_button() throws InterruptedException {
		addBookingPage.clickConfirm();
		Thread.sleep(5000);

	}

}
