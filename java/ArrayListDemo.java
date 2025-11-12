import java.util.*;  
public class ArrayListDemo {
    public static void main(String[] args) {
        
        // Creating a List of Strings using ArrayList (dynamic array)
        List<String> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");
        // Printing the elements of the ArrayList
        System.out.println("Programming Languages:");
        String firstlang = list.get(0);
        String lastlang = list.get(list.size() - 1);

        System.out.println("First Langauge: " + firstlang);
        System.out.println("Last Langauge: " + lastlang);
           // use indexOf() to find the first occurrence of an element in the list
        int ind = list.indexOf("Java");
        System.out.println("First Occurrence of Java is at Index: "+ind);
        // use lastIndexOf() to find the last occurrence of an element in the list
        int l = list.lastIndexOf("Java");
        System.out.println("Last Occurrence of Java is at Index :"+l);
       
        // Checking if element is present using contains() method
        boolean isPresent = list.contains("C++");
        System.out.println("Is C++ present in the list? "+ isPresent);
        System.out.println("-------------------------------------------------------------------------");
          // Using  for loop for iteration
        for (int i = 0; i < list.size(); i++) {

            // Using get() method to access particular element
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        // Enhanced for-loop to iterate through the list
        for (String lang : list) {
            System.out.println(lang);
        }
        System.out.println("-------------------------------------------------------------------------");
        Iterator<String> it = list.iterator();
        System.out.print("Iterator values: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");}
    }
}