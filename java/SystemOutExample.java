class SystemOutExample {

    public static void main(String[] args) {
        int x = 100;
        System.out.println("Learning Java IO");

        //Printing of a simple integer
        System.out.printf("Printing an Integer: x = %d%n", x);

        //Printing a floating-point number with precision
        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float n = 5.2f;

        //Formatting a float to 4 decimals places 
        System.out.printf("Formatted to specific width: n = %.4f%n", n);

        n = 2324435.3f;

        //Right Aligning and formatting a float to 20-character width
        System.out.printf("Formatted to right margin: n = %20.4f%n", n);
    }
}