
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Book bookCollection = new Book();
        Student returnBook = new Student();
        Library availableBook = new Library();
        String bookName;
        String authorName;
        long ISBNCode;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today-");
            System.out.println("1. Issue a new book for me. ");
            System.out.println("2. Return a prevoiusly issued book for me. ");
            System.out.println("3. Show me all my issued books. ");
            System.out.println("4. Exit. ");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the book you want to issue: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    System.out.println("Enter the name of the author of the book:");
                    authorName = scanner.nextLine();
                    bookCollection.issueTheBook();
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    System.out.println("Enter the name of the author of the book:");
                    authorName = scanner.nextLine();
                    returnBook.returnBook();
                    break;
                case SHOW_ISSUED_BOOKS:
                    availableBook.booksAvailable();
                    break;
                default:
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}
