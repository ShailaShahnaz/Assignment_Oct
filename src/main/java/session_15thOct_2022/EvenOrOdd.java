package session_15thOct_2022;

public class EvenOrOdd {
	
	public static void main(String[] args) {
	
		// Write a java program to determine whether this number is even or odd
		// WAJP to determine whether this number is a prime number or not
		// WAJP to determine whether this year is a leap year or not
		
		/*How to determine whether a year is a leap year
		To determine whether a year is a leap year, follow these steps:

			If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
			If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
			If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
			The year is a leap year (it has 366 days).
			The year is not a leap year (it has 365 days).*/
	
		int num = 79;
		int year = 3000;
		
	if (num%2 == 0) {
		System.out.println("num is even : " + num);
	}else if (num%2 != 0) {
		System.out.println("num is odd : " + num);
	}
	
	if (num%num==0 && num%1==0 && num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0) {
		System.out.println("num is prime : " + num);
	}else {
		System.out.println("num is not prime : " + num);
	}
	
	if (year%4==0 && year%100==0 && year%400==0) {
		System.out.println("This is a leap year : " + year);
	}else {
		System.out.println("This is not a leap year: " + year);
	}
	}

}
