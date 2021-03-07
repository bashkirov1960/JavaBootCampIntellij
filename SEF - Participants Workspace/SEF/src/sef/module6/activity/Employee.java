package sef.module6.activity;

public class Employee extends Person {

    private String title;
    private int salary;



    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }
}
