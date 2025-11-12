import java.util.Arrays;

public class Exp_3 {                                        

    public static void main(String[] args) {

        // Given array1 with elements
        int[] array1 = {2, 3, 4, 5, 8, 9};
        
        // Declare array2 with the same size as array1
        int[] array2 = new int[array1.length];

        // Using a for loop to copy elements from array1 to array2
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        // Print the original array1
        System.out.println("Original array1: " + Arrays.toString(array1));

        // Print the copied array2
        System.out.println("Copied array2: " + Arrays.toString(array2));
    }
}