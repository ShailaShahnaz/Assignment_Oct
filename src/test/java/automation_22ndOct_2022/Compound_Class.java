package automation_22ndOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compound_Class {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.className("moneyicon relative")).click();
		// in this locator class is compound. Compound class has more than one word and they have gap in between.
	
	}

}
