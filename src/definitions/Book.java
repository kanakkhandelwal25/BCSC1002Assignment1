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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNCode() {
        return ISBNCode;
    }

    public void setISBNCode(String ISBNCode) {
        this.ISBNCode = ISBNCode;
    }

    public void issueBook() {
        System.out.println("Thank you for issuing the \"" + getBookName() + "\".");
    }

    public String toString() {
        return "Book Name: " + getBookName() + ", " +
                "Author Name: " + getAuthorName() + ", " +
                "ISBN Code: " + getISBNCode() + ".";
    }

}
