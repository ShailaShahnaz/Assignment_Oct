package automation_23rdOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_FaceBook_Validations1 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String ActualUrl = "https://www.facebook.com/";
		String ExpectedUrl = driver.getCurrentUrl();
		String ActualTitle = "Facebook - log in or sign up";
		String ExpectedTitle = driver.getTitle();
		
		if (ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)){
			System.out.println("My Url is correct");
						
		}else {
			System.out.println("My Url is not correct");
			
		}
	}

}
