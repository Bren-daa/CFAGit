package exercice;

import java.util.List;

public class Author {
	private final String fullname;
	private final String lastName;
	private final int age;
	private final List<Book> books;
	
	public Author(String fullname, String lastName, int age, List<Book> b) {
		this.fullname = fullname;
		this.lastName = lastName;
		this.age=age;
		this.books = b;
		
	}
	
	public String toString() {
		return fullname+" "+lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	
}
