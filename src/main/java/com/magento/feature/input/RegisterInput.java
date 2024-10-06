package com.magento.feature.input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.magento.commonSteps.GetAction;
import com.magento.constants.XpathConstantForMagento;
import com.nopCommerce.pojo.RegisterRequestBuilder;

public class RegisterInput {
	public static void getInput(WebDriver driver,RegisterRequestBuilder registerRequestBuilder) {
		InputData(driver,registerRequestBuilder);
		
	}

	private static void InputData(WebDriver driver, RegisterRequestBuilder registerRequestBuilder) {
		List<WebElement> genderSize = driver.findElements(By.xpath(XpathConstantForMagento.REGISTER_GENDER_SIZE_XPATH));
		for(int i=1;i<=genderSize.size();i++) {
			if(driver.findElement(By.xpath(XpathConstantForMagento.REGISTER_GENDER_SIZE_XPATH+"["+i+"]")).getAttribute("class").equals(registerRequestBuilder.getGender())) {
				GetAction.buttonClickUsingXpath(driver, XpathConstantForMagento.REGISTER_GENDER_SIZE_XPATH+"["+i+"]");
			}
		}
		//Enter First Name
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_FIRST_NAME_XPATH, registerRequestBuilder.getFirstName());
		//Enter Last Name
		GetAction.getInput(driver, XpathConstantForMagento.REGISTER_LAST_NAME_XPATH, registerRequestBuilder.getLastName());
		
		
	}
}
