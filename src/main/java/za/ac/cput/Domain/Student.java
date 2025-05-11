package za.ac.cput.Domain;

public class Student extends User {
    private String studentId;
    private String faculty;
    private String enrollmentYear;
    private String currentYear;

    private Student() {
        //Default constructor
    }

    private Student(Builder builder) {
        super(builder); //Inheriting builder attributes from User
        this.studentId = builder.studentId;
        this.faculty = builder.faculty;
        this.enrollmentYear = builder.enrollmentYear;
        this.currentYear = builder.currentYear;
    }

    //Getters
    public String getStudentId() {
        return studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getEnrollmentYear() {
        return enrollmentYear;
    }

    public String getCurrentYear() {
        return currentYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", faculty='" + faculty + '\'' +
                ", enrollmentYear='" + enrollmentYear + '\'' +
                ", currentYear='" + currentYear + '\'' +
                '}';
    }

    //Builder class
    public static class Builder extends User.Builder {
        private String studentId;
        private String faculty;
        private String enrollmentYear;
        private String currentYear;

        //Builder settters.
        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder setFaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }
    }
}
