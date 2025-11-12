
import java.util.*;
public class TreeMapDemo {
    public static void main(String args[]){
    // Create a TreeMap of Strings (keys) and Integers(values)
       TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        System.out.println("TreeMap elements: " + tm);//{}
        tm.put(20, "Java");
        tm.put(15, "For");
        tm.put(5, "Beginners");
        System.out.println("TreeMap elements: " + tm);//
       
        tm.put(15, "FOR");//updating value of a key
        System.out.println("Updated TreeMap = "+tm);

        tm.remove(15);
        System.out.println("TreeMap after removal ="+tm);
        System.out.println("------------------------------------------------");
        //iteration over TreeMap
        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            int k = e.getKey();
            String v = e.getValue();
            
            System.out.println(k + " : " + v);}
    }
}

/*
 A TreeMap in Java is a part of the java.util package that implements the Map interface. 
 It stores key-value pairs in a sorted order using either a natural or custom comparator.
 TreeMap does not allow null keys, but allows null values.
 */