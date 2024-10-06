package stepDefinations;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.magento.commonSteps.ExtentManager;
import com.magento.commonSteps.GetAction;
import com.magento.commonSteps.GetDriver;
import com.magento.constants.XpathConstantForMagento;
import com.magento.feature.input.PerformLogout;
import com.magento.feature.input.PerformSign;
import com.magento.pojo.SignInRequestBuilder;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignInStepDefination {
	private ExtentReports extent;
	private ExtentTest test;
	WebDriver driver;
	SignInRequestBuilder signRequestBuilder = new SignInRequestBuilder();
	@Given("Load webiste")
	public void load_webiste() {
		extent = ExtentManager.getInstance();
		test = extent.createTest("Login Feature");
		test.assignCategory("Regression Testing");
		test.assignAuthor("Bapu Rane");
		driver = GetDriver.getDriver();
	}
	
	@Then("store usercredential {string}{string}")
	public void store_usercredential(String username, String password) {
	    signRequestBuilder.setUsername(username);signRequestBuilder.setPassword(password);
	}
	
	@Then("Click on sing in button")
	public void click_on_sing_in_button() {
	    GetAction.buttonClickUsingXpath(driver, XpathConstantForMagento.SIGN_IN_BUTTON_XPATH);
	}
	
	@Then("Perform sign in")
	public void perform_sign_in() {
		PerformSign.getSignIn(driver, signRequestBuilder,test);
	}

	@Then("Logout user")
	public void logout_user() {
		PerformLogout.getLogout(driver,test);
	}
	@Then("Closed window")
	public void closed_window() {
		GetDriver.getWindowClose(driver);
		extent.flush();
	}

}
