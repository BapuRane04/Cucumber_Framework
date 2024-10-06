package com.magento.feature.input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.magento.commonSteps.GetAction;
import com.magento.constants.XpathConstantForMagento;

public class PerformLogout {
	public static void getLogout(WebDriver driver, ExtentTest test) {
		try {
			Thread.sleep(2000);
			GetAction.buttonClickUsingXpath(driver, XpathConstantForMagento.LOGOUT_BUTTON_XPATH);
			test.info("Logout User");
		} catch (Exception e) {
		}
		
	}

}
