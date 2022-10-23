package session_23rdOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_WebElements {
	//validate Web Elements
	//isDisplayed()
	//isEnabled()
	//isSelected()
	
	//open any regular browser and then - Ctrl+Shift+n it will open incognito mode
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//WebElement forgotPasswordLink = driver.findElement(By.xpath(null))
	}

}
