import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class MainClass {
    public static void main(String[] args) {
        Book bookA1 = new Book("Un livre parmis tant d'autre",150,Category.TECH);
        Book bookA2 = new Book("Un livre Autre Livre",150,Category.POLICIER);

        List<Book> booksAuthor1 = new ArrayList<>();
        booksAuthor1.add(bookA1);
        booksAuthor1.add(bookA2);

        Book bookA3 = new Book("Le livre de la romance",150,Category.ROMANTIC);
        Book bookA4 = new Book("JAVA pour les nuls",150,Category.TECH);

        List<Book> booksAuthor2 = new ArrayList<>();
        booksAuthor2.add(bookA3);
        booksAuthor2.add(bookA4);

        Book bookA5 = new Book("Le livre de la Tech",150,Category.TECH);
        Book bookA6 = new Book("L'amour pour les nuls",150,Category.ROMANTIC);
        Book bookA77 = new Book("L'amour pour les nuls",150,Category.ROMANTIC);

        List<Book> booksAuthor3 = new ArrayList<>();
        booksAuthor3.add(bookA5);
        booksAuthor3.add(bookA6);
        booksAuthor3.add(bookA77);

        Book bookA7 = new Book("Le livre Policier",150,Category.POLICIER);
        Book bookA8 = new Book("Python",150,Category.TECH);
        Book bookA9 = new Book("La romance",150,Category.ROMANTIC);

        List<Book> booksAuthor4 = new ArrayList<>();
        booksAuthor4.add(bookA7);
        booksAuthor4.add(bookA8);
        booksAuthor4.add(bookA9);


        Author author1 = new Author("ayoub","Bhija",24,booksAuthor1);
        Author author2 = new Author("Toto","Tata",28,booksAuthor2);
        Author author3 = new Author("Tomas","Totooo",40,booksAuthor3);
        Author author4 = new Author("Joan","Francois",38,booksAuthor4);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        authorList.add(author4);

        List<String> listFiltered = authorList
                .stream()
                .filter(value -> value.getAge() > 30 && value.getBooks().size() >= 3)
                .map(author -> new StringBuilder().append(author.getFullName().substring(0,1).toUpperCase()).append(author.getFullName().substring(1)).append(" ").append(author.getLastName().toUpperCase()).toString())
                .collect(toList());

        List<String> listBooks = authorList
                .stream()
                .flatMap(value -> value.getBooks().stream())
                .map(book -> book.getTitle())
                .collect(toList());

        System.out.println(listFiltered);
        System.out.println(listBooks);


    }
}
