package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person


public class Student extends Person {

    private String schoolName;

    public Student() {
        this.schoolName = "Unknown";
    }

    public Student(String firstName, String secondName, int age, String schoolName) {
        super(firstName, secondName, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String announce() {
        return "I am study in university " + getSchoolName();
    }

}
