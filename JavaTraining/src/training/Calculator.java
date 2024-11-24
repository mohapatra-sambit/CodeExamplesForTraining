package training;

public class Calculator {
	
	public Calculator(int x) {
//		super();
		this(x, 'a');
	}
	
	
	public Calculator(int x, char c) {
		this(x, c, "testing");
	}
	
	public Calculator(int x, char c, String s) {
		System.out.println(x + ", " + c + ": " + s);
	}

	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public int sum(int x, int y, int z , int c  ) {
		return x + y + z;
	}
	
	//Method Signature --> Method Name + Argument List
	
	/*
	 * Compile-time polymorphism
	 * Overloading -->  2 methods are said to be overloaded method when, 
	 * 	1. Method Signature is different
	 * 	2. Method Name is same
	 * 	which eventually means that the Argument List is different.
	 */
	
	public static void main(String[] args) {
		new Calculator(4);
		new Calculator(3, 'c');
		new Calculator(2, 'd', "xyz");
	}
	
}
