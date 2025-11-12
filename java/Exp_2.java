    import java.util.Arrays;
    import java.util.Scanner;

    public class Exp_2 {                                   //Array Sort Assignment
        public static void main(String[] args) {
            //Initialize Array
            int num[] = {50, 20, 45, 82, 25, 63};

            Scanner sc = new Scanner(System.in);

            //Integer Input From User
            System.out.print("Enter a number to add in array: ");
            int userInput = sc.nextInt();

            // Adding the input into the array
            int newArr[] = new int[num.length + 1];
            for (int i = 0; i < num.length; i++) {
                newArr[i] = num[i];
            }
            newArr[num.length] = userInput;

            //Print Original Array
            System.out.println("Original Array:");
            for (int val : newArr) {
                System.out.print(val + " ");
            }
            System.out.println();

            //Sort the array
            Arrays.sort(newArr);

            //Print sorted array
            System.out.println("Array in Ascending Order:");
            for (int val : newArr) {
                System.out.print(val + " ");
            }

            sc.close();
        }
    }