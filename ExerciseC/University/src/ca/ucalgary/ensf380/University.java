package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        // Create a professor
        Professor profTrump = new Professor("Donald Trump", 77, "Political Science");

        // Create students
        Student student1 = new Student("Joe Doe", 20, "Computer Science", 3.8);
        Student student2 = new Student("Jane Biden", 22, "Physics", 3.9);

        // Add students to professor's supervision
        profTrump.addStudent(student1);
        profTrump.addStudent(student2);

        // Introduce everyone
        profTrump.introduce();
        for (Student student : profTrump.getSupervisedStudents()) {
            student.introduce();
        }

        // Display professor's supervised students
        System.out.println("\nProfessor " + profTrump.getName() + " supervises the following students:");
        for (Student student : profTrump.getSupervisedStudents()) {
            System.out.println("- " + student.getName() + " (" + student.getMajor() + ")");
        }
    }
}