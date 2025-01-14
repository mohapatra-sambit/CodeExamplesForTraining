package training.threads;

public class NewCounter implements Runnable {
	
	private int count = 1;
	
	public synchronized void increment() {
		// Interrupt
		// Wait
		++count;
		for (long i=10000000000l; i>0; i--);
		// Notify
	}

	@Override
	public void run() {
		while (count <= 5000) {
//			System.out.println("-----");
//			System.out.println(Thread.currentThread().getName());
//			System.out.println("Counter: " + count);
//			System.out.println("-----");
			increment();
			
			
		}
	}

}
