package com.maven.learning.MAVEN_AUTOMATION_PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	

	
		public static WebDriver driver;
		public static ChromeOptions options =  new ChromeOptions();
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver().setup();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//div[@id = 'reg_pages-msg']/preceding::a[1]")).click();
			driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("Tony");
			driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Pony");
			driver.findElement(By.xpath("//input[@name = 'reg_email__")).sendKeys("seleniumanda@rediffmail.com");
			driver.findElement(By.xpath("//input[@name = 'reg_email__confirmation__")).sendKeys("seleniumanda@rediffmail.com");
			driver.findElement(By.xpath("//input[@name = 'reg_paswd__")).sendKeys("seleniumanda@rediffmail.com");
			
			Select select = new Select(driver.findElement(By.id("day")));
			select.selectByVisibleText("11");
			
			Select select1 = new Select(driver.findElement(By.id("month")));
			select.selectByVisibleText("Feb");
			
			Select select2 = new Select(driver.findElement(By.id("year")));
			select.selectByVisibleText("1989");
			
			
			
			
			


			
	}

}
