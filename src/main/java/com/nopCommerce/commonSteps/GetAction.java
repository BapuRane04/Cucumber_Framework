package com.nopCommerce.commonSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetAction {
	public static void buttonClickUsingXpath (WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void getInput(WebDriver driver,String xpath, String input) {
		driver.findElement(By.xpath(xpath)).sendKeys(input);
	}
}
