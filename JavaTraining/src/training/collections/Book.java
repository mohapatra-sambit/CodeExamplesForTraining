package training.collections;

public class Book implements Comparable<Book> {

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
		return "Book [name=" + name + ", author=" + author + ", subject=" + subject + "]\n";
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

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public int compareTo(Book book) {
//		System.out.println("Calling CompareTo...");
		if (this.equals(book)) {
			return 0;
		} else {
//			System.out.println(this.name.compareTo(book.name));
			return this.name.compareTo(book.name);
		}
	}

}
