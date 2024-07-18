package ca.ucalgary.ensf380;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private String department;
    private List<Student> supervisedStudents;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
        this.supervisedStudents = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addStudent(Student student) {
        supervisedStudents.add(student);
    }

    public List<Student> getSupervisedStudents() {
        return new ArrayList<>(supervisedStudents);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm Professor " + getName() + ", " + getAge() + " years old, from the " + department + " department.");
    }
}