package automation_9thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class25 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.udemy.com/course/selenium-automation-testing-for-beginners/");
		driver1.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.guru99.com/introduction-to-selenium");
		
		driver1.quit();
		driver2.quit();

	}

}
