package training;

class Building {
	
	public double getAreaInSqFeet() {
		return 0.0;
	}
	
}

class ShoppingMall extends Building {

	@Override
	public double getAreaInSqFeet() {
		return super.getAreaInSqFeet() + 100;
	}
	
}

class ITPark extends Building {
	
}

// This is a comment

/*
 * This is a multi-line
 * comment 
 */

/**
 * This is Apartment class
 * 
 * Apartment is an Object
 * 
 * @author sambit
 * @see 
 * 
 */
public class Apartment extends Building {

	Flat[] allFlats = new Flat[20];
	
	public Apartment() {
		allFlats[0] = new Flat();
	}

	/**
	 * This method return the address of the apartment
	 * @return Address
	 */
	String getAddress() {
		return MyAddress.addressLine1 + ", " + MyAddress.addressLine2 + "\n"
				+ MyAddress.area + ", " + MyAddress.city + "\n"
				+ MyAddress.state + " - " + MyAddress.pincode;
	}
	
	/**
	 * 
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		Apartment a = new Apartment();
		System.out.println(a.getAddress());
		System.out.println();
		System.out.println(10);
		System.out.println();
		System.out.println(a.allFlats[0].getAddress());
	}
}

class Flat {

	String flatNumber = "G-101";
	
	String getAddress() {
		return flatNumber + "\n"
				+ MyAddress.addressLine1 + ", " + MyAddress.addressLine2 + "\n"
				+ MyAddress.area + ", " + MyAddress.city + "\n"
				+ MyAddress.state + " - " + MyAddress.pincode;
	}

}

class MyAddress {

	static String addressLine1 = "120, Something Road";
	static String addressLine2 = "SomePlaceName";
	static String area = "SomeAreaName";
	static String city = "SomeCityName";
	static String state = "SomeStateName";
	static long pincode = 123456;

}