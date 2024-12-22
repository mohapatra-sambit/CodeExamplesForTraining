package training.threads;

public class CounterMain {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(counter, "ThreadOne");
		Thread t2 = new Thread(counter, "ThreadTwo");
		t1.start();
		t2.start();
		System.out.println("main thread spawned 2 child threads - done");
//		counter.run();
		
		
		
		
	}

}
