package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Pages.BookingDetails;
import Pages.BookingListPage;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingDetailsSteps {
	
	private BookingDetails bookingDetails = new BookingDetails(DriverFactory.getDriver());
	private BookingListPage bookingListPage = new BookingListPage(DriverFactory.getDriver());

	String[] split;

	

	@Then("enter Agent {string}")
	public void enter_agent(String agent) throws InterruptedException {
		bookingDetails.enterAgent(agent);


	}
	
	@Then("enter POL {string}")
	public void enter_pol(String POL) throws InterruptedException {
		bookingDetails.enterPol(POL);


	}

	@Then("enter POD {string}")
	public void enter_pod(String POD) throws InterruptedException {
		bookingDetails.enterPod(POD);

	}

	@Then("enter incoterm")
	public void enter_incoterm() {
		bookingDetails.enterIncoterm();

	}

	@Then("click on save")
	public void click_on_save() throws InterruptedException {
		bookingDetails.clickSave();
		Thread.sleep(8000);

	}

	@Then("fill Sailing details")
	public void fill_sailing_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		bookingDetails.clickHeaderDetail();
		List<Map<String, String>> valueList = dataTable.asMaps();
		String vesselValue = valueList.get(0).get("vessel");
		String voyageValue = valueList.get(0).get("Voyage");
		String carrierValue = valueList.get(0).get("Carrier");
		String etaValue = valueList.get(0).get("ETA");
		String etdValue = valueList.get(0).get("ETD");
		
		bookingDetails.clickHeaderDetail();
		Thread.sleep(3000);
		bookingDetails.clickSailingIcon();
		Thread.sleep(5000);
		bookingDetails.clickAddnewSailing();
		bookingDetails.selectVessel(vesselValue);
		bookingDetails.enterVoyage(voyageValue);
		bookingDetails.selectCarrier(carrierValue);	
		bookingDetails.selectEtd(etdValue);
		bookingDetails.selectEta(etaValue);

	}
	
	@Then("click on Sailing save button")
	public void click_on_Sailing_save_button() throws InterruptedException  {
		bookingDetails.clickSailingSave();
		Thread.sleep(3000);
		
	}


	@Then("Fill Equipment details")
	public void fill_equipment_details() {
		bookingDetails.fillEquipmentDetails();

	}

	@Then("fill Order details")
	public void fill_order_details() throws InterruptedException {
		bookingDetails.clickItemDetails();
		Thread.sleep(5000);
		bookingDetails.clickAddNewOrder();
		Thread.sleep(3000);
		bookingDetails.fillUpOrderDetails();
		
	}

	

	@Then("Click on Send to SA button")
	public void click_on_send_to_sa_button() {
		bookingDetails.clickSendtoSa();
	 
	}

	@Then("Approve SA")
	public void approve_sa() throws InterruptedException {
		bookingDetails.clickSa();
		bookingDetails.clickSailing();
		bookingDetails.clickApprover();
		Thread.sleep(4000);
	   
	}

	@Then("fill service contract")
	public void fill_service_contract() {
	
	}

	@Then("Select Sent to Agent")
	public void select_sent_to_agent() {
	 
	}

	@Then("select Confirm booking")
	public void select_confirm_booking() {
	  
	}

	@Then("Convert the booking to Job")
	public void convert_the_booking_to_job() {
	 
	}
	
	@When("get the status of the booking")
	public void get_the_status_of_the_booking() {
	String word =bookingDetails.getStatus();
	 split = word.split("\\s");	    
	}

	@Then("booking status should be {string}")
	public void booking_status_should_be(String status) {
		Assert.assertEquals(status,split[2]);	
		
	}
	
	@Then("Go to Search bar and search booking")
	public void go_to_search_bar_and_search_booking() throws InterruptedException {
		bookingListPage.clickBookingList();
		bookingListPage.enterSearchvalue(split[1]);
		
		
	}
	
	@Then("validate booking")
	public void validate_booking() {
	String actualId= bookingListPage.checkBookingID();
	Assert.assertEquals(actualId, split[1]);
		
		
	}
}
