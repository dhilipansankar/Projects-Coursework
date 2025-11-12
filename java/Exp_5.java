import java.util.Scanner;

public class  Exp_5 {                                                       
    public static void main(String[] args) {

        // Get user input for the number of elements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci sequence: ");

        // Generate the sequence
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();
    }
}

/*The additional '%' symbol seen at the output of this program is a result of 
.zhrc bash [Linux] working with Java's JVM, like how Window's CMD would work with JVM.
There are no critical runtime errors in the written program. */