package selenium_basis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
 
private static final TimeUnit TimeUnits = null;
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnits);
		driver.get("https://rediff.com");
		//syntax of xpath
		
		//1.   //html[@attribute='value'}
		//2.   //html[@attribute= 'value' and @attribute2= 'value'}
		//3.   // html[text()='value']
		//4.    //html[contains(test(),'value')]
		//5.    //htmlcontains(@attribute,'value')]
		//6     //html[starts.with(@attribute,'value')]
		//7.     //html[ends.with(@attribute,'value')]
	
		
		 driver.findElement(By.id("//a[@class,'singin]")).click();
		 
		 driver.findElement(By.xpath("//inout[contains@id,'login']")).sendKeys("Mandeep");
		 
		 driver.findElement(By.xpath("//input[contains@id,'passwor']")).sendKeys("Mandeep@1");
		 
		 driver.findElement(By.xpath("//input@class='signinbtn' and @name= proceed]")).click();
		 
		 driver.findElement(By.xpath("//a[text() ='logout']")).click();
		 
		
	}
	}


