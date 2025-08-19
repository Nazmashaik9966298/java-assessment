package Assessments;
public class DeclaringName {
    // Public variable
    public String name;

    public static  void main(String[] args) {
        // Create an object of Student
        DeclaringName student1 = new DeclaringName();
        // Assign a value to the name variable
        student1.name = "Nazma";
        // Print the name
        System.out.println("Student Name: " + student1.name);
    }
}