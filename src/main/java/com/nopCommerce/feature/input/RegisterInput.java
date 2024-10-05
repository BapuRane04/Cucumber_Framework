package com.nopCommerce.feature.input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.nopCommerce.commonSteps.GetAction;
import com.nopCommerce.constants.XpathConstantForNopCommerce;
import com.nopCommerce.pojo.RegisterRequestBuilder;

public class RegisterInput {
	public static void getInput(WebDriver driver,RegisterRequestBuilder registerRequestBuilder) {
		InputData(driver,registerRequestBuilder);
		
	}

	private static void InputData(WebDriver driver, RegisterRequestBuilder registerRequestBuilder) {
		List<WebElement> genderSize = driver.findElements(By.xpath(XpathConstantForNopCommerce.REGISTER_GENDER_SIZE_XPATH));
		for(int i=1;i<=genderSize.size();i++) {
			if(driver.findElement(By.xpath(XpathConstantForNopCommerce.REGISTER_GENDER_SIZE_XPATH+"["+i+"]")).getAttribute("class").equals(registerRequestBuilder.getGender())) {
				GetAction.buttonClickUsingXpath(driver, XpathConstantForNopCommerce.REGISTER_GENDER_SIZE_XPATH+"["+i+"]");
			}
		}
		
	}
}
