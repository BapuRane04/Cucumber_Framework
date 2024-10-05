package stepDefinations;

import javax.xml.xpath.XPathConstants;

import org.openqa.selenium.WebDriver;

import com.nopCommerce.commonSteps.GetAction;
import com.nopCommerce.commonSteps.GetDriver;
import com.nopCommerce.constants.XpathConstantForNopCommerce;
import com.nopCommerce.feature.input.RegisterInput;
import com.nopCommerce.pojo.RegisterRequestBuilder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationStepDefination {
	WebDriver driver;
	RegisterRequestBuilder registerRequestBuilder = new RegisterRequestBuilder();
	@Given("Open the website")
	public void open_the_website() {
		driver = GetDriver.getDriver();
	}
	@Then("click on register button")
	public void click_on_register_button() {
	    GetAction.buttonClickUsingXpath(driver, XpathConstantForNopCommerce.REGISTER_BUTTON_XPATH);
	}
	@Then("Enter required details {string}{string}{string}{string}{string}{string}{string}{string}")
	public void enter_required_details(String gender, String firstName, String lastName, String dob, String emailId, String companyName, String password, String confirmPassword) {
	    registerRequestBuilder.setGender(gender);registerRequestBuilder.setFirstName(firstName);registerRequestBuilder.setLastName(lastName);
	    registerRequestBuilder.setDob(dob);registerRequestBuilder.setEmailId(emailId);registerRequestBuilder.setCompanyName(companyName);
	    registerRequestBuilder.setPassword(password);registerRequestBuilder.setConfirmPassword(confirmPassword);
	}
	
	@Then("Register User")
	public void register_user() {
		RegisterInput.getInput(driver, registerRequestBuilder);
	}
	
	@Then("Close Window")
	public void close_window() {
	   
	}

}
