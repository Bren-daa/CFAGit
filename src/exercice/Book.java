package exercice;

public class Book {
	private final String title;
	private final int pageNumber;
	private final Categorie categorie;
	
	public Book(String title, int p, Categorie c) {
		this.title=title;
		this.pageNumber=p;
		this.categorie = c; 
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
}
