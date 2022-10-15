package Automation_Oct09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class21 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.microsoft.com/");
		driver1.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://join.codecademy.com/learn/learn-sql/");
		driver2.manage().window().maximize();
		
		driver1.quit();
		driver2.quit();
		

	}

}