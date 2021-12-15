package selenium_basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser_Opening {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, Timeunit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Mandeep");
		driver.findElement(By.id("userEmail")).sendKeys("msidhu583@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("116 Dorcot ave");
		driver.findElement(By.id("permanenrAddress")).sendKeys("116 Dorcot ave");
		driver.findElement(By.id("Confirm_passwd9f6f842d")).sendKeys("2345678ff");
		driver.findElement(By.id("btn btn-primary")).click();
		
	}

}
