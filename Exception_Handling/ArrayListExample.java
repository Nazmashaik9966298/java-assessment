package Phase3;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();

        // Add 10 numbers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Print numbers using for-each loop
        System.out.println("ArrayList elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
