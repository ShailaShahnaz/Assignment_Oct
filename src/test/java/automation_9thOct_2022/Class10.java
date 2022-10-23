package automation_9thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class10 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.techlistic.com");
		driver1.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.qafox.com");
		driver2.manage().window().maximize();
		
		driver1.quit();
		driver2.quit();
		
	}

}
