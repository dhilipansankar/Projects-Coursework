import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo{
    
    public static void main(String[] args){
        
        // Create a LinkedHashMap of Strings (keys) and Integers (values)
        LinkedHashMap<Integer, String> lhm
            = new LinkedHashMap<Integer, String>();

        // Inserting elements into Map
        // using put() method
        lhm.put(3, "Java");
        lhm.put(2, "Python");
        lhm.put(1, "C");
        
        // Displaying the LinkedHashMap
        System.out.println("LinkedHashMap: " + lhm);
             for (Map.Entry<Integer, String> mapElement :lhm.entrySet()) {

            Integer k = mapElement.getKey();

            // Finding the value
            // using getValue() method
            String v = mapElement.getValue();

            // Printing the key-value pairs
            System.out.println(k + " : " + v);
        }
    }
}
/*
 LinkedHashMap
LinkedHashMap in Java is an implementation of the Map interface that combines the features of a hash table and a doubly-linked list. It extends HashMap and, unlike HashMap, guarantees a predictable iteration order.

•	Maintains Insertion Order: 
By default, LinkedHashMap preserves the order in which key-value pairs are inserted into the map. When iterating over a LinkedHashMap, elements will be returned in the order they were added.
•	Performance: 
While LinkedHashMap provides ordered iteration, its performance for basic operations like put, get, and remove is generally similar to HashMap, offering average constant-time complexity. However, it uses slightly more memory than HashMap due to the overhead of maintaining the doubly-linked list.
•	Not Thread-Safe: 
Like HashMap, LinkedHashMap is not synchronized. If used in a multi-threaded environment, external synchronization or wrapping it with Collections.synchronizedMap() is necessary to prevent data inconsistency.

*/