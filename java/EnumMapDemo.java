// Java Program to demonstrate 
// the working of EnumMap 
import java.util.EnumMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapDemo {
    public static void main(String[] args) {
        
        // Create an EnumMap for Day enum
        EnumMap<Day, String> dayMap = new EnumMap<>(Day.class);

        // Add elements to the EnumMap
        dayMap.put(Day.MONDAY, "Start of the week");
        dayMap.put(Day.FRIDAY, "End of the week");
        dayMap.put(Day.SUNDAY, "Weekend");
        System.out.println(dayMap.get(Day.MONDAY));
        System.out.println(dayMap.get(Day.FRIDAY));
        // Print all elements in the EnumMap
        for (Day day : dayMap.keySet()) {
            System.out.println(day + ": " + dayMap.get(day));
        }
    }
}