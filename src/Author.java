import Book;

public class Author{
    private String fullName;
    private String lastName;
    private int age;
    private List<Book> books;

    public Author(String fullName, String lastName, int age, List<Book> books){
        this.fullName = fullName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        return fullName;
    }
    public List<Book> getBooks() {
        return books;
    }
}