package training.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Book> bookMap = new HashMap<String, Book>();
		Book book = new Book("abcd", "xyz", "mnop");
		bookMap.put("ISBN1", book);
		System.out.println(bookMap);
		System.out.println();
		bookMap.put("ISBN2", book);
		System.out.println(bookMap);
	}
}
