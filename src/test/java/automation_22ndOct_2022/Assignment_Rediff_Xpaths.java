package automation_22ndOct_2022;

public class Assignment_Rediff_Xpaths {

	public static void main(String[] args) {
		//Rediff xpaths
		
		//Rediffmail:
		//a[@class='mailicon']
		//a[contains(text(),'Rediffmail')]
		//a[text()='Rediffmail']
		
		//Money:
		//a[@class='moneyicon relative']
		//a[text()='Money']
		//a[contains(text(),'Money')]
		
		//Business Email:
		//a[@class='bmailicon relative']
		//a[contains(@class,'bmailicon relative')]
		//a[contains(text(),'Business Email')]
		
		//Videos:
		//a[@class='vdicon']
		//a[contains(@class,'vdicon')]
		//a[text()='Videos' and @class='vdicon']		
		
		//Shopping:
		//a[@class='shopicon relative']
		//a[text()='Shopping' and @class='shopicon relative']
		//a[contains(@class,'shopicon relative')]
		
		//Sign in:		
		//a[@class='signin']
		//a[contains(@class,'signin')]
		//a[text()='Sign in']
		
		//Create Account:
		//a[text()='Create Account']
		//a[contains(text(),'Create Account')]
		//*[contains(text(),'Create Account')]
		
		//Username:
		//input[@id='login1']
		//input[@name='login']
		//input[contains(@id,'login1')]
		
		//Password:
		//input[@id='password']
		//input[@name='passwd']
		//input[contains(@id,'password')]
		
		//Signin:
		//input[@class='signinbtn']
		//input[@name='proceed']
		//input[contains(@class,'signinbtn')]
		
		//Logout:
		//a[contains(@class,'rd_logout')]
		//a[@class='rd_logout']
		//a[text()='Logout']
		
	
	}

}
