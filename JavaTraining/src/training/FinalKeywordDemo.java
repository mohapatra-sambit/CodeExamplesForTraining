package training;

public final class FinalKeywordDemo {
	
	public static final float pi = 3.145f;
	
	public static final Car c = new Car("red");
	
	public final int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
//		System.out.println(pi);
//		pi++;
//		pi=0;
//		System.out.println(pi);
		System.out.println(c.color);
		c.color="blue";
//		c = new Car("Blue");
		System.out.println(c.color);
		
	}

}
