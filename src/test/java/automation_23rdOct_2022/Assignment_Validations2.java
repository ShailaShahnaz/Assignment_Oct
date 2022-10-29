package automation_23rdOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Validations2 {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println(CreateAccount.isDisplayed());
		System.out.println(CreateAccount.isEnabled());
				
		if (CreateAccount.isDisplayed() && CreateAccount.isEnabled()){
			CreateAccount.click();
			System.out.println("Create New Account is working");
		}else {
			System.out.println("Create New Account is not working");
		}

	}

}
