public class Loopseloop {
    public static void main(String[] args) 
    {
        // Single dimensional Array - 2nd way of defining it
        int nums[] = new int[5];
        System.out.println("first element from nums array: " + nums[0]);

        // By default the value of the elements within the array would be zero.
        System.out.println("\nDefault array values:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Loop to assign new values to the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 100;
        }

        System.out.println("\nUpdated array:");
        // Loop to print the final state of the array
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element " + i + " = " + nums[i]);
        }

        System.out.println("End it!");
    }
}
