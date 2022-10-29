package automation_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_3_WebElements {

public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement UsernameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
		System.out.println(UsernameTextBox.isDisplayed());
		System.out.println(UsernameTextBox.isEnabled());
		System.out.println(UsernameTextBox.isSelected());
		//how can we make it(.isSelected) true?*****************
	
		if (UsernameTextBox.isDisplayed() && UsernameTextBox.isEnabled()&& UsernameTextBox.isSelected()){
			UsernameTextBox.sendKeys("seleniumpanda@rediff.com");
			System.out.println("Username TextBox is working");
		}else {
			System.out.println("Username TextBox is not working");
		}
	
	}

}
