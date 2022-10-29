package automation_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations {
	public static WebDriver driver; 
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		String ActualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		String ActualTitle = "Rediffmail";
		String ExpectedTitle = driver.getTitle();
		
		if (ActualCurrentUrl.equals(ExpectedCurrentUrl) && ActualTitle.equals(ExpectedTitle)){
			
			driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Selenium@123");
			
			//driver.get("https://rediff.com");
			
		}else {
			System.out.println("My Url is not correct");
			
			//driver.get("https://google.com");
		}

	}

}
