package gabrielleffad;

public class Book {
    private final String title;
    private final int pageNumber;
    private final Enum_style_book category;

    public Book(String title, int pageNumber, Enum_style_book category) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getCategory() {
        return category.toString();
    }

    public String toString() {
        return "\n Le livre " + getTitle() + " de category " + getCategory() + " possede " + getPageNumber() + "\n";
    }
}
