package training.collections;

import java.util.ArrayList;
import java.util.List;

import training.exceptionhandling.MyCustomException;

public class MyStack {

	private List<Book> bookStack = new ArrayList<Book>();
	
	//Stack: LIFO - Last In First Out
	
	public void push(Book b) {
		bookStack.add(b);
	}
	
	public Book pop() throws MyCustomException {
		Book book = getTopElement();
		bookStack.remove(bookStack.size() - 1);
		return book;
	}
	
	public Book peek() throws MyCustomException {
		return getTopElement();
	}
	
	public void printStack() throws MyCustomException {
		if (bookStack.isEmpty()) {
			throw new MyCustomException("Stack is empty");
		}
		for (Book book : bookStack) {
			System.out.println(book);
		}
	}
	
	private Book getTopElement() throws MyCustomException {
		if (bookStack.isEmpty()) {
			throw new MyCustomException("Stack is empty");
		}
		int topElementIndex = bookStack.size() - 1;
		Book book = bookStack.get(topElementIndex);
		return book;
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push(new Book("Maths Fundamentals Vol 1", "R D Sharma", "Maths"));
		myStack.push(new Book("Maths Fundamentals Vol 2", "R D Sharma", "Maths"));
		myStack.push(new Book("Maths Fundamentals Vol 3", "R D Sharma", "Maths"));
		myStack.push(new Book("Science Fundamentals Vol 1", "Some Author", "Science"));
		myStack.push(new Book("Science Fundamentals Vol 2", "Some Author", "Science"));
		myStack.push(new Book("Science Fundamentals Vol 3", "Some Author", "Science"));
		myStack.push(new Book("Chemistry Fundamentals Vol 1", "Some Another Author", "Chemistry"));
		myStack.push(new Book("Chemistry Fundamentals Vol 2", "Some Another Author", "Chemistry"));
		myStack.push(new Book("Chemistry Fundamentals Vol 3", "Some Another Author", "Chemistry"));
		myStack.push(new Book("Chemistry Fundamentals Vol 4", "Some Another Author", "Chemistry"));
		
		try {
			System.out.println("Step 1:" +  myStack.peek());
			System.out.println("Step 2:" +  myStack.pop());
			System.out.println("Step 3:" +  myStack.pop());
			myStack.printStack();
//			System.out.println(myStack.peek());
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
		
	}

}
