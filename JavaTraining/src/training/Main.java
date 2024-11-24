package training;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Initial Address....");
		Address address = new Address("213, Second Floor", "PS Insignia Apartments", "10/2, 7/11, Cerebasa Agrahara",
				"10th Main, P L Nagar", "Kedur Hobli", "Rusoh Road", "Bangalore", "Karnataka", "India", 570111);
		System.out.println(address);
		System.out.println(address.getLocation());
		address.display();

		System.out.println("----------");
		System.out.println("Modified Address....");
		Address address1 = address.modifyState("Odisha");
		System.out.println(address1);
		System.out.println(address1.getLocation());
		address1.display();

		System.out.println("----------");
		System.out.println("Original Address....");
		System.out.println(address);
		System.out.println(address.getLocation());
		address.display();
	}
}
