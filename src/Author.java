import java.util.List;

public class Author {
    private final String fullName;
    private final String lastName;
    private final int age;
    private final List<Book> books;

    public Author(String fullName, String lastName, int age, List<Book> books) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }

}
