package training.exceptionhandling;

public class MyCustomException extends Exception {

	private static final long serialVersionUID = 7415449567376675406L;
	
	public MyCustomException(String msg) {
		super(msg);
	}
	
}
