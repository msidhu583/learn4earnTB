package selenium_basis;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alerts {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgibi/lgin.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login1"))));
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println("the text is:" + alert.getText());
		alert.accept();
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffail.com");
	}

}
