package selenium_basis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {





	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit);
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("Msidhu583@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sidhu@91940");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}

}
