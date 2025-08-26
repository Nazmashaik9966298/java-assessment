package Phase3;
public class FinallyExample {
    public static void main(String[] args) {
        System.out.println("Case 1: No exception");
        try {
            int a = 10, b = 2;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: Division by zero.");
        } finally {
            System.out.println("Finally block always executes (Case 1).");
        }

        System.out.println("Case 2: Exception occurs but handled");
        try {
            int a = 10, b = 0;
            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: Division by zero.");
        } finally {
            System.out.println("Finally block always executes (Case 2).");
        }

        System.out.println("Case 3: Exception occurs but not handled");
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerException (not caught here)
        } catch (ArithmeticException e) {
            System.out.println("Caught: Arithmetic error.");
        } finally {
            System.out.println("Finally block always executes (Case 3).");
        }

        System.out.println("Program ends.");
    }
}
