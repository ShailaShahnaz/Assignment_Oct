package assignment_Nov6th_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//class assignment and also home assignment!

public class CSS_Selector_Rediff {
  
	static WebDriver driver;

	@BeforeTest
  public void a() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
  }
@Test
public void b() throws InterruptedException {
	driver.findElement(By.cssSelector("a.signin")).click();
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a.rd_logout")).click();
		
}
@AfterTest
public void c() {
	driver.quit();
}
}
