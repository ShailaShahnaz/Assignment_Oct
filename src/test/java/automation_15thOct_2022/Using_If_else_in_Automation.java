package automation_15thOct_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_If_else_in_Automation {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		String Browser = "Chrome";
		String Browser1 = "Firefox";
		String Browser2 = "Edge";
		
		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}else if (Browser1.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}else if (Browser2.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
		}else {
			System.out.println("None of the browsers works");
		}
//since every condition is true here, the execution will stop after the first condition fulfills. 
		
		Thread.sleep(2000);
		driver.close();
	
	}
}
