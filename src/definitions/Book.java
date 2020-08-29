package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNCode;

    public Book() {
        this.bookName = "Let us Java";
        this.authorName = "Yashwant Kanetkar";
        this.ISBNCode = "978-93-5176-471-7";
    }

    public Book(String bookName, String authorName, String ISBNCode) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNCode = ISBNCode;
    }
}
