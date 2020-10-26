public class Book {
    private final String title;
    private final int pageNumber;
    private final Category category;

    public Book(String title, int pageNumber, Category category) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.category = category;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
