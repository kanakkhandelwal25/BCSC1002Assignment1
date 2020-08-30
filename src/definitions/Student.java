
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String studentName;
    private long rollNumber;
    private int noOfBooksIssued;
    private Book[] booksIssued;

    public Student(String studentName, long rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Name: " + getStudentName() + ", " +
                "Roll Number: " + getRollNumber() + ".";
    }

    public Book[] getBooksIssued() {
        return booksIssued.clone();
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

    public Student() {
        this.booksIssued = new Book[5];
        for (int i = 0; i < booksIssued.length; i++) {
            booksIssued[i] = new Book();
        }
    }

    /**
     * @return name of the books issued
     */
    public String booksIssued() {
        return Arrays.toString(booksIssued);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student book = (Student) o;
        return Arrays.equals(getBooksIssued(), book.getBooksIssued());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBooksIssued());
    }


}
