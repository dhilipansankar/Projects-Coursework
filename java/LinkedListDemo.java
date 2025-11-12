import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){
      
        // Creating a LinkedList
        LinkedList<String> l = new LinkedList<String>();
        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        l.add(1, "For");//adding element at index

        System.out.println(l);
        l.set(1, "FOR");//With the help of the set() method, we can update an element in a LinkedList. 
        System.out.println(l);
          // Function call
        l.remove(1);

        System.out.println("After the Index Removal " + l);

        l.remove("One");
        System.out.println("After the Object Removal "+ l);

        // Using the Get method and the for loop 
        for (int i = 0; i < l.size(); i++) { 
  
            System.out.println(l.get(i) + " "); 
        } 

        System.out.println(); 
    }
}