import java.util.List;

public class Author {
    private final String fullname;
    private final String lastName;
    private final int age;
    private List<Book> books;

    public Author(String fullname, String lastName, int age, List<Book> books) {
        this.fullname = fullname;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

    public int getAge() {
        return this.age;
    }

    public int numberBooks() { return this.books.size(); }

    public List<Book> getListBook() { return books; }

    @Override
    public String toString() {
        return (new StringBuilder())
                .append(this.fullname.substring(0, 1).toUpperCase())
                .append(this.fullname.substring(1))
                .append(" ")
                .append(lastName.toUpperCase()).toString();
    }
}
