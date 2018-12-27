package com.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.util.Utilitiy;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinitions {

	Utilitiy uti = new Utilitiy();
	
	@Before
	public void setup() {
		// define driver
		System.setProperty("webdriver.gecko.driver", "src/test/resources/executables/geckodriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("useAutomationExtension", false);
		Utilitiy.driver = new ChromeDriver(option);
		Utilitiy.driver.manage().window().maximize();
		Utilitiy.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				byte[] animation = ((TakesScreenshot) Utilitiy.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(animation, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(!scenario.isFailed()){
			try {
				byte[] animation = ((TakesScreenshot) Utilitiy.driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(animation, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Utilitiy.driver.quit();

	}
	
	@Given("^I Open browser$")
	public void i_Open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.gotoWebSite();
	}

	@When("^I click Sign in link$")
	public void i_click_Sign_in_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.click_Sign_in_link();
	}

	@When("^I input email \"([^\"]*)\"$")
	public void i_input_email(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_email(email);
	}

	@When("^I click Create an account button$")
	public void i_click_Create_an_account_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.click_Create_an_account_button();
	}

	@When("^I input you personal information and I click radio button select gender \"([^\"]*)\"$")
	public void i_input_you_personal_information_and_I_click_radio_button_select_gender(String gender) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.click_radio_button_select_gender(gender);
	}

	@When("^I input first name \"([^\"]*)\"$")
	public void i_input_first_name(String firstname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_first_name(firstname);
	}

	@When("^I input last name \"([^\"]*)\"$")
	public void i_input_last_name(String lastname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_last_name(lastname);
	}

	@When("^I input password \"([^\"]*)\"$")
	public void i_input_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_password(password);
	}

	@When("^I input date of birth: day \"([^\"]*)\" and I input month \"([^\"]*)\" and I input year \"([^\"]*)\"$")
	public void i_input_date_of_birth_day_and_I_input_month_and_I_input_year(String day, String month, String year) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_date_of_birth(day, month, year);
	}

	@When("^I input your address and I input first name \"([^\"]*)\"$")
	public void i_input_your_address_and_I_input_first_name(String firstname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_first_name(firstname);
	}

	@When("^I input company \"([^\"]*)\"$")
	public void i_input_company(String company) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_company(company);
	}

	@When("^I input address \"([^\"]*)\"$")
	public void i_input_address(String address) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.input_address(address);
	}

	@When("^I input address line \"([^\"]*)\"$")
	public void i_input_address_line(String addressline) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_address_line(addressline);
	}

	@When("^I input city \"([^\"]*)\"$")
	public void i_input_city(String city) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_city(city);
	}

	@When("^I input state \"([^\"]*)\"$")
	public void i_input_state(String state) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_state(state);
	}

	@When("^I input postal code \"([^\"]*)\"$")
	public void i_input_postal_code(String postalcode) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_postal_code(postalcode);
	}

	@When("^I input country \"([^\"]*)\"$")
	public void i_input_country(String country) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_country(country);
	}

	@When("^I input additional information \"([^\"]*)\"$")
	public void i_input_additional_information(String additional) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   uti.input_additional_information(additional);
	}

	@When("^I input home phone \"([^\"]*)\"$")
	public void i_input_home_phone(String homephone) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_home_phone(homephone);
	}

	@When("^I input mobile phone \"([^\"]*)\"$")
	public void i_input_mobile_phone(String mobilephone) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_mobile_phone(mobilephone);
	}

	@When("^I input assign an address alias for future reference \"([^\"]*)\"$")
	public void i_input_assign_an_address_alias_for_future_reference(String assignaddress) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    uti.input_assign_an_address_alias_for_future_reference(assignaddress);
	}

	@When("^I click on Register button$")
	public void i_click_on_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uti.click_on_Register_button();
	}

	@Then("^I verify result when create an account successfully$")
	public void i_verify_result_when_create_an_account_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
	
}
