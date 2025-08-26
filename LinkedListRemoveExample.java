package Phase3;
import java.util.LinkedList;
public class LinkedListRemoveExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emma");
        System.out.println("Original LinkedList: " + names);
        names.removeFirst();
        names.removeLast();
        System.out.println("After removing first and last elements: " + names);
    }
}
