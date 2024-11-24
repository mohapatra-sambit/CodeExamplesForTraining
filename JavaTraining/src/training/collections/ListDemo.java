package training.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import training.exceptionhandling.MyCustomException;

public class ListDemo {
	
//	private List<Book> library = new ArrayList<Book>();
	private List<Book> library = new LinkedList<Book>();
	
	public void addBookToLibrary(String name, String author, String subject) {
		library.add(new Book(name, author, subject));
	}
	
	public void addBookToLibrary(String name, String author, String subject, int index) {
		library.set(index, new Book(name, author, subject));
	}
	
	public Book getBookFromLibrary(int index) throws MyCustomException {
		if(library.isEmpty()) {
			throw new MyCustomException("Library has no books");
		}
		if(index > library.size()) {
			throw new MyCustomException("Book doesn't exist");
		}
		return library.get(index);
	}
	
	public int getBooksCount() {
		return library.size();
	}
	
	public void removeBookFromLibrary(int index) throws MyCustomException {
		if(library.isEmpty()) {
			throw new MyCustomException("Library has no books");
		}
		library.remove(index);
	}
	
	public void displayAllBooks() {
		for(int i=0; i<library.size(); i++) {
			System.out.println(library.get(i));
		}
	}

}
