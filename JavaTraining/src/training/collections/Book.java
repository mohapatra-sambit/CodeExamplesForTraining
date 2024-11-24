package training.collections;

public class Book {
	
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

}
