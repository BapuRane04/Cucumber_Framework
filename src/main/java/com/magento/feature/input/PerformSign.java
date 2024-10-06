package com.magento.feature.input;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.magento.commonSteps.GetAction;
import com.magento.constants.XpathConstantForMagento;
import com.magento.pojo.SignInRequestBuilder;

public class PerformSign {
	public static void getSignIn(WebDriver driver,SignInRequestBuilder signRequetBuilder, ExtentTest test) {
		getInput(driver,signRequetBuilder,test);
		getLogin(driver,signRequetBuilder,test);
	}

	private static void getLogin(WebDriver driver, SignInRequestBuilder signRequetBuilder, ExtentTest test) {
		GetAction.buttonClickUsingXpath(driver, XpathConstantForMagento.LOGIN_BUTTON_XPATH);
		test.info("Clicked On Login Button");
	}

	private static void getInput(WebDriver driver, SignInRequestBuilder signRequetBuilder, ExtentTest test) {
		GetAction.getInput(driver, XpathConstantForMagento.EMAIL_ID_XPATH, signRequetBuilder.getUsername());
		test.info("Username: "+signRequetBuilder.getUsername());
		GetAction.getInput(driver, XpathConstantForMagento.PASSWORD_XPATH, signRequetBuilder.getPassword());
		test.info("Password: "+signRequetBuilder.getPassword());
	}
}
