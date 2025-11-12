public class SystemErrExample {

    // Java Program demonstrating System.err
    // It is used to display error messages. 
    // It works similarly to System.out with print(), println(), and printf().

    public static void main(String[] args) {

        // Using print()
        System.err.print("This is an error message using print().\n");

        // Using println()
        System.err.println("This is another error message using println().");

        // Using printf()
        System.err.printf("Error code: %d, Message: %s\n", 404, "Not Found");
    }
}