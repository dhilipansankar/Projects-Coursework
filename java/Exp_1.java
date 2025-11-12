import java.util.Scanner;

public class Exp_1 {                        //Palindrome Check Class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input From User
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        //StringBuffer to reverse
        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();

        //Verifying palindrome
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Entered string is a palindrome!");
        } else {
            System.out.println("Entered string is NOT a palindrome!");
        }

        sc.close();
    }
}
