package training;

public abstract class MyCalculatorBySiddhant implements MyCalculator {

	@Override
	public int getProduct(int x, int y) {
		int result = 0;
		for (int i=0; i<y; i++) {
			result += x;
		}
		return result;
	}

	public abstract double getSqrRoot(int a);

}
