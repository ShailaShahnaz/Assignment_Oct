package automation_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_WebElements {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement UsernameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
		//why can't we write .sendKeys("seleniumpanda@rediff.com")?
		System.out.println(UsernameTextBox.isDisplayed());
		System.out.println(UsernameTextBox.isEnabled());
		System.out.println(UsernameTextBox.isSelected());
		//UsernameTextBox.sendKeys("seleniumpanda@rediff.com"); //doesnt work
		//TextBox doesn't count as clickable.

	}

}
