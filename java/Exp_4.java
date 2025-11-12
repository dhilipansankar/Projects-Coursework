public class Exp_4 {               //Finding Greatest Number

    public static void main(String[] args) {
        
        // Given numbers
        int a = 10;
        int b = 20;
        int c = 30;

        // Use if-else statements to find the greatest number
        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println(c + " is the greatest number.");
        }
    }
}