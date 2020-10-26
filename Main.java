import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("titre1", 42, Category.ROMANTIC);
        Book book2 = new Book("titre2", 43, Category.POLICIER);
        Book book3 = new Book("titre3", 44, Category.TECH);
        Book book4 = new Book("titre4", 45, Category.ROMANTIC);

        Author author1 = new Author("fullName1", "lastName1", 8, Arrays.asList(
                book1, book2, book3, book4
        ));

        Author author2 = new Author("fullName2", "lastName2", 28, Arrays.asList(
                book1, book2
        ));

        Author author3 = new Author("fullName3", "lastName3", 48, Arrays.asList(
                book1, book2, book3, book4, book4
        ));

        Author[] authors = {author1, author2, author3};

        List<Author> authorFilter = Arrays.stream(authors)
                .filter(auth -> auth.numberBooks() > 3)
                .filter(auth -> auth.getAge() > 30)
                .collect(Collectors.toList());

        System.out.println(authorFilter.toString());

        List<Book> books = authorFilter.stream()
                .flatMap(x -> x.getListBook().stream())
                .collect(Collectors.toList());

        System.out.println(books.toString());


    }
}
