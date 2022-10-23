package automation_9thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	static WebDriver driver;
	static WebDriver driver1;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://walmart.com");
		
		driver.quit();
		driver1.quit();
		

	}

}
