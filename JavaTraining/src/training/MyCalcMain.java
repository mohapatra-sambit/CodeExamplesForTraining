package training;

public class MyCalcMain {
	
	public static void main(String[] args)  throws Exception  {
//		MyCalculator myCalculator = new MyCalculatorByAditya();
//		System.out.println(myCalculator.getProduct(10, 5));
//		System.out.println(myCalculator.getSqrRoot(10));
//		System.out.println();
		
//		myCalculator = new MyCalculatorBySiddhant();
//		System.out.println(myCalculator.getProduct(10, 5));
//		System.out.println(myCalculator.getSqrRoot(10));
		
//		String str = "abcd";
//		String str1 = str.concat("def");
//		String str2 = str.replace('a', 'z');
//		System.out.println();
		
		MyCalculatorByAditya calc = new MyCalculatorByAditya();
		System.out.println(calc.divide(10, 0));
		

	}

}
