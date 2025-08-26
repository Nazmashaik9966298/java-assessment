package Phase3;
public class NestedClassExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic error.");
            }
            try {
                String text = null;
                System.out.println(text.length());
            } catch (NullPointerException e) {
                System.out.println("Inner catch: Null object accessed.");
            }

            System.out.println("Outer try block completed.");

        } catch (Exception e) {
            System.out.println("Outer catch caught: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}
