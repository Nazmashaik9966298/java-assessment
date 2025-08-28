package Phase3;
import java.util.ArrayList;
public class ArrayListSizeVsEmpty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        list.add("Java");
        list.add("Python");

        // Check size() and isEmpty() after adding elements
        System.out.println("After adding elements:");
        System.out.println("Size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        list.clear();

        System.out.println("\nAfter clearing list:");
        System.out.println("Size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
