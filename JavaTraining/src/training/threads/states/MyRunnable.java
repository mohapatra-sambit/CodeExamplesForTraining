package training.threads.states;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1);
			for (int i=10000; i>0; i--);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
