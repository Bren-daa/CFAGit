package gabrielleffad;

import java.util.ArrayList;

public class Author {
    private final String fullName;
    private final String lastName;
    private int Age;
    StringBuffer str = new StringBuffer();

    private ArrayList<Book> books;

    public Author(String fullName, String lastName, int Age) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.Age = Age;
        books = new ArrayList<Book>();
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return fullName;
    }

    public String getAge() {
        return fullName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String toString() {
        for (Book book : books) {
            str.append(book.getTitle() + "\n");
        }
        return "\n L'auteur " + fullName + " " + lastName + " d'un age de " + Age + " a ecrit les ouvrages:"
                + str.toString()+"\n";
    }
}