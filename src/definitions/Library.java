
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksAvailable;

    public Library() {
        this.booksAvailable = new Book[5];
        for (int i = 0; i < booksAvailable.length; i++) {
            booksAvailable[i] = new Book();
        }
    }

    public Book[] getBooksAvailable() {
        return booksAvailable.clone();
    }

    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    /**
     * @return name of the available books
     */
    public String booksAvailable() {
        return Arrays.toString(booksAvailable);
    }
}
