package automation_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_Url_Title {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		String ActualUrl = "https://www.rediff.com/";
		String ExpectedUrl = driver.getCurrentUrl();
		String ActualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String ExpectedTitle = driver.getTitle();
		
		if (ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExpectedTitle)){
			System.out.println("My coding is correct");
		}else
			System.out.println("My coding is incorrect");
	}

}
//on Rediff.com page
//right click on an empty space on the web page>view source page>copy title 
//Title> Rediff.com: News | Rediffmail | Stock Quotes | Shopping
