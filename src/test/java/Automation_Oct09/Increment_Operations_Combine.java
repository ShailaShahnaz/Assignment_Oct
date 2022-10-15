package Automation_Oct09;

public class Increment_Operations_Combine {

	public static void main(String[] args) {
		
		int i = 1;
		
		int j = ++i - --i;
		//j=2-1=1
		//i=    2,    1
		int k = j-- - --i + i-- - --j;
		//k=    1   -  0  + 0   - (-1) = 2
		//j=     0,                -1
		//i=           0,    -1
		
		/*System.out.println(i);
		System.out.println(j);
		System.out.println(k); */
		
		int l = --k - k-- + i-- - --i + j++ - --j;
		  //l =  1  - 1   + (-1)- (-2)+(-1) - (-2)
		  //l =  1   -1    -1    +2    -1     +2  = 2
		  //k =  1,  0
		  //i =           -2,     -3
		  //j =                         0,     -1     
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
	}

}
