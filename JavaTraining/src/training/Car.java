package training;

public class Car {
	
	private String registrationNumber;
	String color;
	String chassisNumber;
	
	public Car(String color) {
		super();
		this.color = color;
	}

	int numberOfAirBags = 6;
	
	Wheel[] wheels = new Wheel[4];

	Radio radio = new Radio();
	
	static int carCount = 0;
	
	void honk() {
		
	}
	
	void drive() {
		
	}
	
	void switchOnAC(int speed) {
		
	}
	
	void playRadio() {
		radio.play(RadioStation.frequency);
	}
	
	@Override
	public String toString() {
		return "Car with color: " + color + ".";
	}

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			new Car("");
//		}
		Car c = new Car("Red");
		System.out.println(c.toString());
		System.out.println(c.color);
		System.out.println(c.radio.toString());
	}

}

class Wheel {
	
	String color = "Black";
	
	String company = "MRF";
	
}

class Radio extends Object {
	
	void play(String freq) {
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car has this radio";
	}
	
}

class RadioStation {
	
	static String frequency = "100.4FM";
	
}