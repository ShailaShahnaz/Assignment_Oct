package session_15thOct_2022;

public class AccessModifiers {

	public static void main(String[] args) {
		// 4 types 
		// public - highest accessibility -- it can be accessed from any package and any class
		// protected -- it can be accessed from the classes of the same package
		// private -- it can be accessed only from that class
		// default --no key word required for default modifier 
		
	}

	public static void test() {
		System.out.println("This is a simple test method");
	}
	protected static void test1() {
		System.out.println("This is a simple test1 method");
	}
	private static void test2() {
		System.out.println("This is a simple test2 method");
	}
	static void test3() {
		System.out.println("This is a simple test3 method");
		//This is default modifier. Default modifier doesn't need any keyword
	}
	
	/*default static void test4() {
		System.out.println("This is a simple test4 method");
		//default methods are allowed only in interfaces
	}*/
	
}
