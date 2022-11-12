package assignment_Nov6th_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector_Facebook {

	static WebDriver driver;
	
	@BeforeTest
	public void method1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
				
	}
	
	@Test
	public void method2() throws InterruptedException {
		driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		
		 driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Selenium");
		 driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Panda");
		 driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("seleniumpanda@rediff.com");
		 driver.findElement(By.cssSelector("input[name=reg_email_confirmation__]")).sendKeys("seleniumpanda@rediff.com");
		 driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Selenium123");
		 
		 driver.findElement(By.cssSelector("select#month option[value=\"1\"]")).click();
		 driver.findElement(By.cssSelector("select#day option[value=\"3\"]")).click();
		 driver.findElement(By.cssSelector("select#year option[value=\"2017\"]")).click();
		 driver.findElement(By.cssSelector("label._58mt +  input[value=\"1\"]")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[name=websubmit]")).click();
		 
	}
	
	@AfterTest
	public void method3() {
		driver.close();
	}
	
}





