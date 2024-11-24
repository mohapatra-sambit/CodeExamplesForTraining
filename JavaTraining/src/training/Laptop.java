package training;

public class Laptop {

	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public String getProduct() {
		return product;
	}

	public String getColor() {
		return color;
	}

	private String product;
	
	private String color;

	public Laptop(String brand, String product, String color) {
		super();
		this.brand = brand;
		this.product = product;
		this.color = color;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			createObjectAndPrint(i);
		}
	}

	private static void createObjectAndPrint(int i) {
		Laptop laptop = new Laptop("Lenovo", "T16-" + i, "Black");
		System.out.println(laptop);
		System.out.println(laptop.product);
		System.out.println();
	}
	
}
