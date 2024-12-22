package training.threads.states;

import java.lang.Thread.State;

public class ThreadStates {
	
	private static Thread th = new Thread(new MyRunnable());
	
	public static void main(String[] args) {
		System.out.println(th.getState().name());
		th.start();
		while(true) {
			State state = th.getState();
			System.out.println(state.name());
			if (state.equals(State.TERMINATED)) {
				break;
			}
		}
	}

}
