package com.magento.constants;

public class XpathConstantForMagento {
	
	//REGISTRATION XPATH
	public static String REGISTER_BUTTON_XPATH = "//a[text()='Create an Account']";
	public static String REGISTER_FIRST_NAME_XPATH = "//input[@id='firstname']";
	public static String REGISTER_LAST_NAME_XPATH = "//input[@id='lastname']";
	public static String REGISTER_EMAIL_XPATH = "//input[@id='email_address']";
	public static String REGISTER_PASSWORD_XPATH = "//input[@id='password']";
	public static String REGISTER_CONFIRM_PASSWORD_XPATH = "//input[@id='password-confirmation']";
	public static String REGISTER_CREATE_ACCOUNT_BUTTON_XPATH = "//button[@title='Create an Account']";
	
	//LOGIN XPATH 
	
	public static String SIGN_IN_BUTTON_XPATH = "//li[@class='authorization-link']//following::a[contains(text(),'Sign In')]";
	public static String EMAIL_ID_XPATH = "//input[@id='email']";
	public static String PASSWORD_XPATH = "//input[@id='pass']";
	public static String LOGIN_BUTTON_XPATH = "//button[@name='send']";
	
	//LOGOUT XPATH 
	public static String LOGOUT_BUTTON_XPATH = "//button[contains(@class,'action switch')]";
}
