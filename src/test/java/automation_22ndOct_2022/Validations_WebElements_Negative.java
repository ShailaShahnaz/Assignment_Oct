package automation_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_WebElements_Negative {

public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediff.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium1234");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		WebElement ErrorMessage=driver.findElement(By.xpath("//div[@id='div_login_error']"));
		
		System.out.println(ErrorMessage.getText());
		
	}

}
