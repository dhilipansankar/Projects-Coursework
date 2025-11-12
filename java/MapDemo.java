import java.util.HashMap;
import java.util.Map;

public class MapDemo{
    
    public static void main(String[] args){
        
        // Create a Map using HashMap
        Map<String, Integer> m = new HashMap<>();

        // Adding key-value pairs to the map
        m.put("Java", 1);
        m.put("Python", 2);
        m.put("C++", 3);

        System.out.println("Map elements: " + m);
    }
}