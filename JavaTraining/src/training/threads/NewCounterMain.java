package training.threads;

import java.lang.Thread.State;

public class NewCounterMain {
	
	public static void main(String[] args) {
		NewCounter counter = new NewCounter();
		Thread t1 = new Thread(counter, "ThreadOne");
		Thread t2 = new Thread(counter, "ThreadTwo");
		t1.start();
		State t1State = t1.getState();
		System.out.println("t1: " + t1State.name());
		t2.start();
		State t2State = t2.getState();
		System.out.println("t2: " + t2State.name());
		
		while(true) {
			t1State = t1.getState();
			System.out.println("t1: " + t1State.name());
			t2State = t2.getState();
			System.out.println("t2: " + t2State.name());
			if (t1State.equals(State.TERMINATED) && t2State.equals(State.TERMINATED)) {
				break;
			}
		}
		
//		System.out.println("main thread spawned 2 child threads - done");
	}

}
