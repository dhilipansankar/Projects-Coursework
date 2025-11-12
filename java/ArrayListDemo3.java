import java.util.*;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        // Creating a List of Strings using ArrayList (dynamic array)
        List<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");

        // Checking if an element is present using contains() method
        boolean isPresent = list.contains("C++");
        System.out.println("Is C++ present in the list? " + isPresent);
        System.out.println("---------------------------------------");

        // Using for loop for iteration
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            // Using get() method to access particular element
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n---------------------------------------");

        // Enhanced for-loop to iterate through the list
        System.out.println("Using enhanced for-loop:");
        for (String lang : list) {
            System.out.print(lang + " ");
        }
        System.out.println("\n---------------------------------------");

        // Using Iterator to iterate through the list
        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        System.out.print("Iterator values: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}