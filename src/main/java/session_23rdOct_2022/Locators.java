package session_23rdOct_2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	//16 Locators in Selenium 4
	
			//1. id
			//2. className
			//3. name
			//4. xpath
			//5. cssSelector
			//6. tagname
			//7. linkText
			//8. partiallinkText
			
			//9. ByAll
			//10. ByIdOrName
			//11. ByChained
			
			//12. above
			//13. below
			//14. near
			//15. toRightOf
			//16. toLeftOf
	
	public static WebDriver driver;
		
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//tagName is a locator, is mostly used to identify multiple web elements
		//Determine all the web elements with html div? - - interview question
		
		List<WebElement> AllDivTags = driver.findElements(By.tagName("div"));
		System.out.println(AllDivTags.size());
		
		WebElement UserNameTextBox = driver.findElement(By.id("login1"));
		System.out.println(UserNameTextBox.getTagName());
		
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.partialLinkText("Create Acc")).click();
		
		
	}

}
