import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Create a list to store strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print all elements in the list
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element from the list
        fruits.remove("Banana");

        // Print the updated list
        System.out.println("\nAfter removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
