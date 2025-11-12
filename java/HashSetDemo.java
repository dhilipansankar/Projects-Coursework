import java.util.HashSet;
import java.util.Set;

public class HashSetDemo{
    
  	public static void main(String args[]) 
    {
        // Create a Set using HashSet
        Set<String> s = new HashSet<>();

        // Displaying the Set
        System.out.println("Set Elements: " + s);//[] this is empty set
        s.add("B");
        s.add("B");
        s.add("C");
        s.add("A");

        System.out.println(s);
        String s1 ="D";
        System.out.println("Contains " + s1+ " " + s.contains(s1));
        // Removing custom element using remove() method
        s.remove("B");
        System.out.println("After removing element " + s);
        System.out.println("-----------------------------------------------------------------------");
        // Iterating through the Set via for-each loop 
        for (String value : s)

            // Printing all the values inside the object 
            System.out.print(value + ", ");
        
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        
    }
}