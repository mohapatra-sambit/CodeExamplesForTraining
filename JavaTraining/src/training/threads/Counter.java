package training.threads;

public class Counter implements Runnable {
	
	private int count = 1;

	@Override
	public void run() {
		while (count <= 100) {
			System.out.println("-----");
			System.out.println(Thread.currentThread().getName());
			System.out.println("Counter: " + count);
			System.out.println("-----");
			++count;
		}
	}

}
