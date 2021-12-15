package com.java.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Xpath_Progrsm {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.rediff.com/");
			   // driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		
			    driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']")).click();
			 driver.findElement(By.xpath(" //div[@class='floatL leftwidth']/child::div[2]/child::div[1]/child::div[2]/input[@name='login']")).sendKeys("seleniumpanda");
			 driver.findElement(By.xpath("//input[@name='FormName']/following::input[@id='password' and @name='passwd']")).sendKeys("Selenium@123");
			    
			 driver.findElement(By.xpath("//img[@id='fill_metric']/preceding::input[@name='proceed']")).click();
			

			 driver.findElement(By.xpath("//cite[@class='rd_logo']/descendant::a[1]/following::div[@class='setting_rd']/child::a[@class='rd_setting_panel']/following::a[@class='rd_logout']")).click();

	}

}
