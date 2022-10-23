package session_15thOct_2022;

public class Variables {
	//A Java variable is a piece of memory that can contain a data value.A variable has a data type.
	//Variables are typically used to store information, with which your java program needs to do its job
	//Q:how many types of variable are there?
	//A:(1)Global--this has two types: instance and static.(2)local
	//Instance variable:This variables are declared directly under the class, not inside any method
	//
	
	//"Global instance" variable. Is this a "Global non-static" variable also?
	int j;
	String name;
	
	//"Global static" variable
	static String language;//this is a "Global static" variable, because the keyword static is associate with it. This is also a "Global instance" variable.
	
	public static void main(String[] args) {
	int i = 1;
	
	//i is a local variable here which stores a data value. that means it stores data in the heap memory location. 
	//generally there are five types of memory locations; these are-- Method area, Heap Memory,Stack Memory,PC Registers,Native Area
	
	String s1 = "Python";
	//s1 is a local variable here
	
	}
	public static void test() {
		int i = 1;//i is a local variable
		int j = 2;//j is a local variable
		//local variables are within the method itself.there range, scope and limitatinos are within that method itself.
		
	}

}
