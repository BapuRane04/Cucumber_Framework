package com.magento.feature.input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.magento.commonSteps.GetAction;
import com.magento.constants.XpathConstantForMagento;
import com.magento.pojo.RegisterRequestBuilder;

public class RegisterInput {
	public static void getInput(WebDriver driver,RegisterRequestBuilder registerRequestBuilder) {
		inputData(driver,registerRequestBuilder);
		registerUser(driver);
	}

	private static void registerUser(WebDriver driver) {
		//Click On Crate An Account Button
		GetAction.buttonClickUsingXpath(driver, XpathConstantForMagento.REGISTER_BUTTON_XPATH);
	}

	private static void inputData(WebDriver driver, RegisterRequestBuilder registerRequestBuilder) {
		//Enter First Name
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_FIRST_NAME_XPATH, registerRequestBuilder.getFirstName());
		//Enter Last Name
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_LAST_NAME_XPATH, registerRequestBuilder.getLastName());
		//Enter Email Id
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_EMAIL_XPATH, registerRequestBuilder.getEmailId());
		//Enter Password 
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_PASSWORD_XPATH, registerRequestBuilder.getPassword());
		//Enter Confirm Password 
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_CONFIRM_PASSWORD_XPATH, registerRequestBuilder.getConfirmPassword());
	}
}
