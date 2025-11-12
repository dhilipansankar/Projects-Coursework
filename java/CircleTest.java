import java.util.Scanner; // We need this for user input!

class Circle_2 {
    int radius;
    static float pi = 3.14f;
    
    Circle_2() {}
    
    Circle_2(int r) {
        this.radius = r;
    }
    
    void calculateArea() {
        System.out.println("Area of the Circle with radius " + this.radius + " = " + (pi * this.radius * this.radius)+"cm");
    }
    
    void diameter() { // Renamed for clarity, and fixed the calculation!
        System.out.println("Diameter of the Circle with radius " + this.radius + " = " + (2 * this.radius)+"cm");
    }
    
    void circumference() {
        System.out.println("Circumference of the Circle with radius " + this.radius + " = " + (2 * pi * this.radius)+"cm");
    }
}

public class CircleTest {
    public static void main(String args[]) {
        System.out.println("Calculate Circle Stuff!");
        
        // Set up Scanner for input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for radius
        System.out.print("Input radius of circle in cm: ");
        int userRadius = scanner.nextInt();
        
        // Create a Circle object with the user's radius
        Circle_2 circle = new Circle_2(userRadius);
        
        // Show options and ask what to calculate
        System.out.println("What do you want to calculate?");
        System.out.println("1. Area");
        System.out.println("2. Diameter");
        System.out.println("3. Circumference");
        System.out.print("Select a number (1-3): ");
        int choice = scanner.nextInt();
        
        // Based on choice, approprriate method will be called 
        if (choice == 1) {
            circle.calculateArea();
        } else if (choice == 2) {
            circle.diameter();
        } else if (choice == 3) {
            circle.circumference();
        } else {
            System.out.println("Oops! That's not a valid choice. Please pick 1, 2, or 3 next time.");
        }
        
        // Close Scanner input to avoid input confusions
        scanner.close();
        
        System.out.println("-----------------------");
    }
}
