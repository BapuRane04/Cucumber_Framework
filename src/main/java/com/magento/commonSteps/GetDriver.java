package com.magento.commonSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.magento.constants.UrlConstant;

public class GetDriver {
	static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(UrlConstant.NOP_COMMERCE_LOGIN_URL);
		//Maximize The Window
		driver.manage().window().maximize();
		//Apply Implicit Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void getWindowClose(WebDriver driver) {
		driver.quit();
	}
}
