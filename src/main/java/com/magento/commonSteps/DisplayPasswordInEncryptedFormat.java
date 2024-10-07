package com.magento.commonSteps;

public class DisplayPasswordInEncryptedFormat {
	
	public static String getPasswordEncrypt(String password) {
		return "*".repeat(password.length());
	}

}
