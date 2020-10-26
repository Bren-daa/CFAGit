import java.util.List;

public class Author {
    private String fullname;
    private String lastName;
    private int age;
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

    public int numberBooks() {
        return books.size();
    }

    @Override
    public String toString() {
        return new String(this.fullname.substring(0, 1).toUpperCase() + this.fullname.substring(1) + " " + lastName.toUpperCase() + "\n");
    }
}
