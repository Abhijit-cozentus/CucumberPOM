package stepdefinitions;


import org.junit.Assert;

import Pages.LoginPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	private static String actualTitle;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on the login page of EWL")
	public void user_is_on_the_login_page_of_ewl() {
		DriverFactory.getDriver().get("https://ewlstaging.azurewebsites.net/unauth/login");

	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		actualTitle=loginPage.getPageTitle();
		System.out.println(" page title is: " + actualTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(actualTitle.contains(expectedTitle));
		//Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Then("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);

	}

	@Then("clicks on Sign in button")
	public void clicks_on_sign_in_button() throws InterruptedException {
		loginPage.clickLoginBtn();
		Thread.sleep(5000);
	}



}
