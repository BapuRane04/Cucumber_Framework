package stepDefinations;

import javax.xml.xpath.XPathConstants;

import org.openqa.selenium.WebDriver;

import com.magento.commonSteps.GetAction;
import com.magento.commonSteps.GetDriver;
import com.magento.constants.XpathConstantForMagento;
import com.magento.feature.input.RegisterInput;
import com.magento.pojo.RegisterRequestBuilder;

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
	    GetAction.buttonClickUsingXpath(driver, XpathConstantForMagento.REGISTER_BUTTON_XPATH);
	}
	@Then("Enter required details {string}{string}{string}{string}{string}")
	public void enter_required_details(String firstName, String lastName, String emailId, String password, String confirmPassword) {
	    registerRequestBuilder.setFirstName(firstName);registerRequestBuilder.setLastName(lastName);
	    ;registerRequestBuilder.setEmailId(emailId);registerRequestBuilder.setPassword(password);registerRequestBuilder.setConfirmPassword(confirmPassword);
	}
	
	@Then("Register User")
	public void register_user() {
		RegisterInput.getInput(driver, registerRequestBuilder);
	}
	
	@Then("Close Window")
	public void close_window() {
	   
	}

}
