package training;

public class ParameterPassingDemo {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("In the beginning...");
		System.out.println(a);
		
		methodOne(a);
		
		System.out.println("After MethodOne call...");
		System.out.println(a);
		
		// Next Example
		
		System.out.println("\n\n");
		Student st = new Student();
		st.name = "Sambit";
		System.out.println("Initially...");
		System.out.println(st.name);
		methodTwo(st);
		System.out.println("After MethodTwo...");
		System.out.println(st.name);
		methodThree(st);
		System.out.println("After MethodThree...");
		System.out.println(st.name);
		methodFour(st);
		System.out.println("After MethodFour...");
		System.out.println(st.name);
	}

	private static void methodFour(Student st4) {
		st4.name = "Siddhant";
	}
	
	private static void methodThree(Student st3) {
		st3.name = "Mayur";
	}

	private static void methodTwo(Student st2) {
		st2.name = "Aditya";
	}

	private static void methodOne(int b) {
		b++;
		System.out.println("Inside MethodOne...");
		System.out.println(b);
	}

}

class Student {
	
	public String name;
	
	public String rollNo;
	
	public Student() {
		
	}

}
