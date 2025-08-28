package Phase3;
public class NullPointExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int a = 10, b = 0;
            //System.out.println(text.length()); // NullPointerException
            int[] numbers = {1, 2, 3};
           System.out.println(numbers[5]); // General Exception (ArrayIndexOutOfBoundsException)

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: Division by zero.");
        } catch (NullPointerException e) {
            System.out.println("Null Error: Attempted to access a null object.");
        } catch (Exception e) {
            System.out.println("General Error: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}



