package selenium_basis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {
	
	
    public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com");
		driver.findElement(By.cssSelector("abtn.block.resume-tn-.btn-orange.t2")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\owner\\Downloads\\Drive picture\\2018-08");
		
		
		
	}

}
