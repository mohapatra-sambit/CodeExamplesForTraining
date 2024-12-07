package training.collections;

public class ListDemoMain {

	public static void main(String[] args) {
		
		ListDemo demo = new ListDemo();
//		try {
//			demo.removeBookFromLibrary(3);
//		} catch (MyCustomException e) {
//			System.out.println(e.getMessage());
//		}
		demo.addBookToLibrary("Vol 1: Maths Fundamentals", "R D Sharma", "Maths");
		demo.addBookToLibrary("Vol 2: Maths Fundamentals", "R D Sharma", "Maths");
		demo.addBookToLibrary("Vol 3: Maths Fundamentals", "R D Sharma", "Maths");
		demo.addBookToLibrary("Vol 1: Science Fundamentals", "Some Author", "Science");
		demo.addBookToLibrary("Vol 2: Science Fundamentals", "Some Author", "Science");
		demo.addBookToLibrary("Vol 3: Science Fundamentals", "Some Author", "Science");
		demo.addBookToLibrary("Vol 1: Chemistry Fundamentals", "Some Another Author", "Chemistry");
		demo.addBookToLibrary("Vol 2: Chemistry Fundamentals", "Some Another Author", "Chemistry");
		demo.addBookToLibrary("Vol 3: Chemistry Fundamentals", "Some Another Author", "Chemistry");
		demo.addBookToLibrary("Vol 3: Chemistry Fundamentals", "Some Another Author", "Chemistry");
		
		demo.arrangeAllBooks();		

		demo.displayAllBooks();
		
//		try {
//			demo.getBookFromLibrary(4);
//		} catch (MyCustomException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println();
//		try {
//			Book book = demo.getBookFromLibrary(2);
//			System.out.println(book);
//		} catch (MyCustomException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println();
//		
//		System.out.println("Total number of books in the library: " + demo.getBooksCount());
//		
//		System.out.println("\n\n");
//		
//		try {
//			demo.removeBookFromLibrary(0);
//		} catch (MyCustomException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		demo.displayAllBooks();
//		System.out.println("Total number of books in the library: " + demo.getBooksCount());
//		
//		Book book = new Book("Maths Fundamentals", "R D Sharma", "Maths");
//		System.out.println(demo.isBookAvailable(book));
		
		
		//////////
//		Book book1 = new Book("ABCD", "XYZ", "MNOP");
//		Book book2 = new Book("ABCD", "XYZ", "MNOP");
//		Book book2 = book1;
//		System.out.println(book1);
//		System.out.println(book1.equals(book2));
		
	}

}
