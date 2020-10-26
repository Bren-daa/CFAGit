package gabrielleffad;

public class main_test {
   public static void main(String[]args) {
       StringBuffer str = new StringBuffer();
       final Book b0 = new Book("title0", 10, Enum_style_book.ROMANTIC);
       final Book b1 = new Book("title1", 11, Enum_style_book.POLICIER);
       final Book b2 = new Book("title2", 12, Enum_style_book.TECH);
       final Author a0 = new Author("Gabriel", "Leffad", 12);
       final Author a1 = new Author("Nicolas", "LEJEUNE", 113);
       a0.addBook(b0);
       a0.addBook(b1);
       a1.addBook(b2);
       str.append(a0.toString());
       str.append(a1.toString());
       str.append(b0);
       str.append(b1);
       str.append(b2);
       System.out.println(str.toString());
   } 
}
