
package definitions;

public class Student {

    private String studentName;
    private long rollNumber;
    private int noOfBooksIssued;
    private String[] booksIssued;

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

}
