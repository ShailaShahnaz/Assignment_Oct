package session_15thOct_2022;

public class If_Else_Statements {

	public static void main(String[] args) {
		// to get System.out.println(), write syso + press enter 
		/*syntex for else-if ladder 
		
			if (condition){
				//Print the logic
			}else if (condition) {
				//print the logic
			}else if (condition) {
				//print the logic
			}else {
				//print final logic
			}*/
			 
			 // write a java program to find the greatest of 4 numbers
		
				int a = 10;
				int b = 20;
				int c = 30;
				int d = 40;
				
				if (a>b && a>c && a>d) {
					System.out.println("a is the greatest = " + a);
				}else if (b>c && b>d && b>a) {
					System.out.println("b is the greatest = " + b);
				}else if (c>d && c>a && c>b) {
					System.out.println("c is the greatest = " + c);
				}else {
					System.out.println("d is the greatest = " + d);
				}

				
	}
}


