package Phase3;
public class DivisionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        System.out.println("Program continues after handling the exception");
    }
}
