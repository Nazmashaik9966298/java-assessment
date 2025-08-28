package Phase3;
import java.util.ArrayList;
public class ArrayListContainsExample1 {
     public static void main(String[] args) {
         ArrayList<String> fruits = new ArrayList<>();

         fruits.add("Apple");
         fruits.add("Banana");
         fruits.add("Mango");
         fruits.add("Orange");

         System.out.println("Fruits List: " + fruits);

         String searchFruit = "Mango";
         if (fruits.contains(searchFruit)) {
             System.out.println(searchFruit + " exists in the list.");
         } else {
             System.out.println(searchFruit + " does not exist in the list.");
         }
         searchFruit = "Grapes";
         if (fruits.contains(searchFruit)) {
             System.out.println(searchFruit + " exists in the list.");
         } else {
             System.out.println(searchFruit + " does not exist in the list.");
         }
     }
 }

