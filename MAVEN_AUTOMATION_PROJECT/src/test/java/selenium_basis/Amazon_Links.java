package selenium_basis;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Links {

	public static <WebElements> void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca");
	//	List<WebElement> links=driver.findElements(By.tagName("a"));
	//	int count=links.size();
		//System.out.println("Total number of links"+count);
		driver.quit();
	}

}
