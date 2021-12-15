package com.java.Xpath;

import java.nio.file.FileSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Program {

	
	private static final Object Expectedcurrenturl = null;
	public static ChromeDriver driver;
	
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.rediff.com/");
	    System.out.println(driver.getTitle());
	    String ActalTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

	    String ExpectedTitle = driver.getTitle();
	    
	    System.out.println(driver.getCurrentUrl());
	    String Actualcurrenturl = "https://www.rediff.com/";
	    String ExpectedCurrenturl = driver.getCurrentUrl();
	    
	    if(ActalTitle.equals(ExpectedTitle)  &&  Actualcurrenturl.equals(Expectedcurrenturl)) {
	    	System.out.println("Both my validtions aout this webpage is correct");
	    }else {
	    	System.out.println("Webpage is sham ");
	    }
	    
	    //if(ActalTitle.equals(ExpectedTitle)) {
	    	
	    //}else{
	    //	System.out.println("It is spam url");
	    //}
	    

	    //.isEnable(), .isDisplayed(), .isSeleted();
	    
	    WebElement siginlink = driver.findElement(By.className("signin"));
	    System.out.println(siginlink.isDisplayed());
	    
	    boolean b1 = siginlink.isDisplayed();
	    boolean b2 = siginlink.isEnabled();
	     
	    if(b1== true && b2 == true) {
	     driver.findElement(By.className("signin")).click();
	    }else {
	    	System.out.println("This link is not operaional");
	    }
	    
	    
	    WebElement keepMeSignedIn =  driver.findElement(By.id("remember"));
	    
	    boolean b3 = keepMeSignedIn.isSelected();
	    if(b3 == true) {
	    	System.out.println("Is checked");
	    	
	    }else {
	    	System.out.println("Is not checked");
	    }
	}

}
