package training.collections;

public class Book /* implements Comparable<Book> */ {

	private String name, author, subject;

	public Book(String name, String author, String subject) {
		super();
		this.name = name;
		this.author = author;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", subject=" + subject + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Book book = (Book) obj;
		if (this.author.equalsIgnoreCase(book.getAuthor()) && this.name.equalsIgnoreCase(book.getName())
				&& this.subject.equalsIgnoreCase(book.getSubject())) {
			return true;
		}
		return false;
	}
	
	

//	@Override
//	public int compareTo(Book book) {
//		if (this.author.equalsIgnoreCase(book.getAuthor()) && this.name.equalsIgnoreCase(book.getName())
//				&& this.subject.equalsIgnoreCase(book.getSubject())) {
//			return 0;
//		} else {
//			return this.author.compareTo(book.getAuthor());
//		}
//	}

}
