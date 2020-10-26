package exercice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	public static void main(String[] args) {
		List<Author> authors = new ArrayList<>();
		List<Book> books = new ArrayList<>();
		books.add(new Book("Oui1", 40, Categorie.POLICIER));
		books.add(new Book("Oui2", 40, Categorie.POLICIER));
		books.add(new Book("Oui3", 40, Categorie.POLICIER));
		books.add(new Book("Oui4", 40, Categorie.POLICIER));
		
		authors.add(new Author("jean1", "joel1", 40, books));
		authors.add(new Author("Jean2", "JOEL2", 30, books));
		authors.add(new Author("Jean3", "JOEL3", 25, books));
		authors.add(new Author("Jean4", "JOEL4", 35, books));
		
		List<Author>res = authors.stream().filter(a -> a.getAge()>=30).filter( a -> a.getBooks().size()>3).collect(Collectors.toList());
		System.out.println(res);
			
	}
}
