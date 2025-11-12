import java.util.*;

class VectorDemo {
    public static void main(String[] arg)
    {
        // Creating a default vector
        Vector v1 = new Vector();

        // Adding custom elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("ABC");
        v1.add("XYZ");
        v1.add(3);

        System.out.println("Vector v1 is " + v1);
        // Removing first occurrence element at 1
        v1.remove(1);
        System.out.println("After removal: " + v1);
        System.out.println("----------------------------------------------------------------");
        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);
        
        System.out.println("Vector v2 is " + v2);
        // Using the Get method and the for loop
        for (int i = 0; i < v2.size(); i++) {

            System.out.print(v2.get(i) + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        for (int num : v2){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
    }
}