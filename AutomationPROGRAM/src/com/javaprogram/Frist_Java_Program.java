package com.javaprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Frist_Java_Program {

	public static void main(String[] args) {
		
   	System.setProperty("webdriver.gecko.driver" , "C:\\Learning Automation\\Brower Driver\\geckodriver.exe");
   	WebDriver driver = new FirefoxDriver();
   	driver.manage().window().maximize();
   	
   	driver.get("https://google.com");
	}

	
}
