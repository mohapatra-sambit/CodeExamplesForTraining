package training;

public class MyCalculatorByAditya implements MyCalculator {

	@Override
	public int getProduct(int x, int y) {
		return x * y;
	}

	@Override
	public double getSqrRoot(int a) {
		return Math.sqrt(a);
	}
	
	public double divide(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("You are trying to divide 2 numbers, but the denominator is 0.");
		}
		return x/y;
	}

}
