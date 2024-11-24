package training;

public final class Address implements Cloneable {

	private Location location;

	private final String city;

	private final String state;

	private final String country;

	private final long zipCode;

	static private class Location implements Cloneable {

		private final String addressLine1;

		private final String addressLine2;

		private final String addressLine3;

		private final String addressLine4;

		private final String addressLine5;

		private final String addressLine6;

		public Location(String addressLine1, String addressLine2, String addressLine3, String addressLine4,
				String addressLine5, String addressLine6) {
			super();
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.addressLine3 = addressLine3;
			this.addressLine4 = addressLine4;
			this.addressLine5 = addressLine5;
			this.addressLine6 = addressLine6;
		}

		protected String getAddressLine1() {
			return addressLine1;
		}

		protected String getAddressLine2() {
			return addressLine2;
		}

		protected String getAddressLine3() {
			return addressLine3;
		}

		protected String getAddressLine4() {
			return addressLine4;
		}

		protected String getAddressLine5() {
			return addressLine5;
		}

		protected String getAddressLine6() {
			return addressLine6;
		}

		protected void display() {
			System.out.println(addressLine1);
			System.out.println(addressLine2);
			System.out.println(addressLine3);
			System.out.println(addressLine4);
			System.out.println(addressLine5);
			System.out.println(addressLine6);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

	}

	public Address(String al1, String al2, String al3, String al4, String al5, String al6, String city, String state,
			String country, long zipCode) {
		this(new Location(al1, al2, al3, al4, al5, al6), city, state, country, zipCode);
	}

	private Address(Location location, String city, String state, String country, long zipCode) {
		this.location = location;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	// TODO: This method must be commented
	public Location getLocation() {
		return location;
	}
	// TODO: This method must be commented

	public String getAddressLine1() {
		return location.getAddressLine1();
	}

	public String getAddressLine2() {
		return location.getAddressLine2();
	}

	public String getAddressLine3() {
		return location.getAddressLine3();
	}

	public String getAddressLine4() {
		return location.getAddressLine4();
	}

	public String getAddressLine5() {
		return location.getAddressLine5();
	}

	public String getAddressLine6() {
		return location.getAddressLine6();
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void display() {
		location.display();
		System.out.println(city);
		System.out.println(state);
		System.out.print(country);
		System.out.println("  " + zipCode);
	}

	public Address modifyLocation(String line1, String line2, String line3, String line4, String line5, String line6) {
		line1 = line1 == null ? "" : line1;
		line2 = line2 == null ? "" : line2;
		line3 = line3 == null ? "" : line3;
		line4 = line4 == null ? "" : line4;
		line5 = line5 == null ? "" : line5;
		line6 = line6 == null ? "" : line6;
		try {
			Address newAddress = (Address) this.clone();
			newAddress.location = new Location(line1, line2, line3, line4, line5, line6);
			return newAddress;
		} catch (CloneNotSupportedException e) {
			System.out.println("Unable to change");
			return null;
		}
	}

	public Address modifyCity(String city) {
		try {
			Location newLocation = (Location) this.location.clone();
			Address newAddress = new Address(newLocation, city, getState(), getCountry(), getZipCode());
			return newAddress;
		} catch (CloneNotSupportedException e) {
			System.out.println("Unable to change");
			return null;
		}
	}

	public Address modifyState(String state) {
		try {
			Location newLocation = (Location) this.location.clone();
			Address newAddress = new Address(newLocation, getCity(), state, getCountry(), getZipCode());
			return newAddress;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Address modifyCountry(String country) {
		try {
			Location newLocation = (Location) this.location.clone();
			Address newAddress = new Address(newLocation, getCity(), getState(), country, getZipCode());
			return newAddress;
		} catch (CloneNotSupportedException e) {
			System.out.println("Unable to change");
			return null;
		}
	}

	public Address modifyZipCode(long zipCode) throws CloneNotSupportedException {
//		try {
			Location newLocation = (Location) this.location.clone();
			Address newAddress = new Address(newLocation, getCity(), getState(), getCountry(), zipCode);
			return newAddress;
//		} catch (CloneNotSupportedException e) {
//			System.out.println("Unable to change");
//			return null;
//		}
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Some Address";
//	}

}
