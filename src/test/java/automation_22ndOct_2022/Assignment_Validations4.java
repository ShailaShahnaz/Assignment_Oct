package automation_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Validations4 {
public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://github.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());	

		String ActualCurrentUrl = "https://github.com/";
		String ExpectedCurrentUrl = driver.getCurrentUrl();
		String ActualTitle = "GitHub: Where the world builds software · GitHub";
		String ExpectedTitle = driver.getTitle();
		
		if (ActualCurrentUrl.equals(ExpectedCurrentUrl) && ActualTitle.equals(ExpectedTitle)){
			System.out.println("My Url is correct");
		}else {
			System.out.println("My Url is not correct");
		}
	}

}
