package com.magento.commonSteps;

import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	public static void getScreenShot(WebDriver driver,String testCase) {
		try {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			LocalDateTime now = LocalDateTime.now();
	        
	        // Define the desired format
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH-mm");
	        
	        // Format the date and time
	        String formattedDate = now.format(dateFormatter);
	        String formattedTime = now.format(timeFormatter);
	        
	        // Create the dynamic path
	        //String dynamicPath = Paths.get(formattedDate, formattedTime).toString();
	        
	        // Create the directory
	        
	        File directory = new File(formattedDate+File.separator+formattedTime);
	        if (directory.mkdir()) {
	            System.out.println("Directory created: " + directory);
	        } else {
	            System.out.println("Directory already exists or failed to create: " + directory);
	        }

			File destinationFile = new File(System.getProperty("user.dir")+File.separator+"Screenshots"+File.separator+directory+File.separator+testCase+".png");
			FileUtils.copyFile(file, destinationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
