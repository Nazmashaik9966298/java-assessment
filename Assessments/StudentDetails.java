package Assessments;
    class Student {
        String name;
        int rollnumber;
        float marks;
        // Constructor to initialize the student
        Student(String name, int rollNumber, float marks) {
            this.name = name;
            this.rollnumber = rollNumber;
            this.marks = marks;
        }
        // Method to display student details
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollnumber);
            System.out.println("Marks: " + marks);
            System.out.println(); // Just for spacing
        }
    }
    // Main class
    public class StudentDetails {
        public static void main(String[] args) {
            // Create two Student objects
            Student student1 = new Student("Nazma",101,89.5f);
            Student student2 = new Student("Sujitha", 102, 76.0f);
            // Display the details
            System.out.println("Student 1 Details:");
            student1.displayDetails();

            System.out.println("Student 2 Details:");
            student2.displayDetails();

        }
    }

