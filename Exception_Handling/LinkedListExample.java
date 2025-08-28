package Phase3;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Saritha");
        names.add("Sujitha");
        names.add("Nazma");
        names.add("kavitha");
        names.add("Bhavya");
        String thirdName = names.get(2);
        System.out.println("All names in LinkedList: " + names);
        System.out.println("3rd element: " + thirdName);
    }
}

