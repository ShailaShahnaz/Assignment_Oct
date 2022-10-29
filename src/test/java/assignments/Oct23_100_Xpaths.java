package assignments;

public class Oct23_100_Xpaths {

	public static void main(String[] args) {
		
		//https://www.rediff.com - - Rediffmail:
		
		//a[@class='mailicon']
		//a[contains(text(),'Rediffmail')]
		//a[text()='Rediffmail']
		//div[@class='cell topicons']/child::a[@class='mailicon']
		//div[@class='cell']/following-sibling::div[@class='cell topicons']/child::a[@class='mailicon']
		//div[@class='table']/div[@class='cell']/following-sibling::div[@class='cell topicons']/child::a[@class='mailicon']
		//div[@class='table']//ancestor::a[@class='mailicon']
		//div[@class='table']/child::div[@class='cell topicons']/child::a[@class='mailicon']
		//div[@class='logobar']/descendant::a[@class='mailicon']
		//a[text()='Money']/preceding::a[contains(text(),'Rediffmail')]
		
		//https://www.facebook.com/-- Email
		
		//input[@id='email']
		//input[@id='email' and @name='email']
		//input[@name='login_source']/preceding-sibling::div[1]/child::div[1]/child::input[@id='email']
		//input[@name='next']/preceding-sibling::div[1]/child::div[1]/child::input[@id='email']
		//div[@id='reg_pages_msg']/preceding::input[@id='email']
		//input[@id='pass']/preceding::input[1]
		//div[@id='passContainer']/preceding::input[@id='email']
		//input[@name='lsd']/following-sibling::div[1]/descendant::input[@id='email']
		//div[@id='globalContainer']/descendant::input[@id='email']
		//div[@id='pageFooter']/preceding::input[@id='email']
		
		//https://www.Amazon.com -- sign in
		
		//div[@id='nav-flyout-ya-signin']/a[@class='nav-action-button']/span[@class='nav-action-inner']
		//div[@id='nav-flyout-ya-signin']/a[@class='nav-action-button']/span[text()='Sign in']
		//div[@id='nav-al-signin']/descendant::a[@class='nav-action-button']/span[text()='Sign in']
		//div[@id='nav-al-signin']/descendant::span[text()='Sign in']
		//div[@id='nav-al-container']/descendant::span[text()='Sign in']
		//div[@class='nav-arrow']/following-sibling::div[1]/descendant::div[@id='nav-flyout-ya-signin']/descendant::span[text()='Sign in']
		//div[@id='nav-al-wishlist']/preceding::span[@class='nav-action-inner']
		//div[@id='nav-al-your-account']/preceding::span[@class='nav-action-inner']
		//a[@id='nav_prefetch_yourorders']/preceding::span[@class='nav-action-inner']
		//div[@id='nav-flyout-amazonfresh']/preceding::span[@class='nav-action-inner']
		
		//https://openweathermap.org/-- home icon
		
		//iframe[@id='google_esf']/following-sibling::body[1]/child::nav/descendant::img[1]
		//li[@class='logo']/descendant::img[1]
		//ul[@id='first-level-nav']/descendant::img[1]
		//nav[@id='nav-website']/descendant::img[1]
		//ins[@class='adsbygoogle adsbygoogle-noablate']/following-sibling::nav[@id='nav-website']/descendant::img[1]
		//div[@id='banner_android']/following-sibling::nav[@id='nav-website']/descendant::img[1]
		//body[@class='body-orange']/child::nav[@id='nav-website']/descendant::img[1]	
		//div[@class='banner_stripe']/following-sibling::nav[@id='nav-website']/descendant::img[1]
		//div[@class='banner_stripe']//following-sibling::ins/following-sibling::nav[@id='nav-website']/descendant::img[1]
		//body[@class='body-orange']/child::nav[@id='nav-website']/child::ul/descendant::img[1]
		
		//https://www.guru99.com/-- Home button
		
		//ul[@id='primary-menu']/descendant::a[text()='Home']
		//nav[@id='site-navigation']/descendant::a[text()='Home']
		//div[@id='mobile-header']/preceding::a[text()='Home']
		//div[@id='inner-wrap']//preceding::a[text()='Home'] 
		//div[@id='primary']//preceding::a[text()='Home'] 
		//footer[@id='colophon']/preceding::a[text()='Home'] 
		//div[@id='mobile-drawer']/preceding::a[text()='Home'] 
		//div[@id='search-drawer']/preceding::a[text()='Home'] 
		//style[@id='wp-custom-css']/following::ul[@id='primary-menu']/descendant::a[text()='Home']
		//header[@id='masthead']/descendant::a[text()='Home']
		
		//http://automationpractice.com/index.php--Sign in
		
		//div[@class='header_user_info']/a[contains(text(),'Sign in')]
		//div[@class='header_user_info']/child::a[contains(text(),'Sign in')]
		//div[@class='header_user_info']/descendant::a[contains(text(),'Sign in')]
		//div[@class='header_user_info']/descendant::a[contains(@class,'login')]
		//div[@class='header_user_info']/descendant::a[@class='login']
		//header[@id='header']/descendant::a[@class='login']
		//div[@id='page']/descendant::a[@class='login']
		//body[@id='index']/descendant::a[@class='login']
		//body[@id='index']/descendant::div[@class='header_user_info']/child::a[@class='login']
		//div[@id='columns']/preceding::a[@class='login']
		
		//https://www.walmart.com/-- Walmart icon
		
		//a[@class='dn db-hdkp flex-none pa3 pt2 hover-bg-dark-blue']/child::img[@class='db']
		//div[@class='flex items-center justify-center dn-hdkp']/following-sibling::a[@class='dn db-hdkp flex-none pa3 pt2 hover-bg-dark-blue']/child::img[@class='db']
		//div[@class='relative']/preceding::img[@class='db']
		//div[@class='dn db-hdkp ml3 relative']/preceding::img[@class='db']
		//iframe[@id='tmx_tags_iframe']/preceding::img[@class='db']
		//section[@class='dn db-hdkp'][1]/preceding::img[@class='db']
		//div[@class='dn db-hdkp relative'][1]/preceding::img[@class='db']
		//div[@class='undefined'][1]/preceding::img[@class='db']
		//div[@class='pa4'][1]/preceding::img[@class='db']
		//i[@class='ld ld-Spark'][1]/following::img[@class='db']
		
		//https://forum.piit.us/-- Home Button
		
		//li[@id='button_home']/a[@class='active ']/child::span[text()='Home']
		//li[@id='button_home']/child::a[@class='active ']/span[contains(text(),'Home')]  
		//div[@id='topnav']/descendant::span[text()='Home']
		//div[@id='toolbar']/descendant::span[text()='Home']
		//div[@id='header']/following-sibling::div[@id='toolbar']/descendant::span[text()='Home']
		//div[@id='wrapper']/child::div[@id='toolbar']/descendant::span[text()='Home']
		//li[@id='button_help']/preceding::span[text()='Home']
		//li[@id='button_login']/preceding::span[text()='Home']
		//li[@id='button_register']/preceding::span[text()='Home']
		//div[@id='bodyarea']/preceding::span[text()='Home']
		
		//https://www.oracle.com/
		
		//div[@id='maincontent']/preceding::div[@id='u30logo']
		//div[@id='parentwrap']/preceding::div[@id='u30logo']
		//span[@class='sr-only']/preceding::div[@id='u30logo']
		//div[@class='cwidth']/preceding::div[@id='u30logo']
		//header[@class='rw-ctitle']/preceding::div[@id='u30logo']
		//h4[text()='Cloud Infrastructure']/preceding::div[@id='u30logo']
		//p[@class='desc']/preceding::div[@id='u30logo']
		//button[text()='Products']/preceding::div[@id='u30logo']
		//h4[text()='Build and run']/preceding::div[@id='u30logo']
		//span[text()='Global Cloud Datacenter Infrastructure']/preceding::div[@id='u30logo']
		//span[contains(text(),'Global Cloud Datacenter')]/preceding::div[@id='u30logo']
		
		
		
		
		
	}	

}
