package Assessments;
import java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number (A):");
        double A = scanner.nextDouble();

        System.out.print("Enter second number (B):");
        double B = scanner.nextDouble();

        System.out.print("Enter third number (C):");
        double C = scanner.nextDouble();

        // Calculating the average of three numbers
        double average = (A + B + C) / 3;
        System.out.println("Average"+average);
    }
}