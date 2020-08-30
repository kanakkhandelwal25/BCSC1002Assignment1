
package definitions;

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


}
