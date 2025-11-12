class Circle{
    int radius;
    static float pi = 3.14f; 

    Circle(){}

    Circle(int r) {
        this.radius = r;
    }

     void calculateArea() {
        System.out.println("Area of the Circle with radius " + this.radius + " = " + (pi * this.radius * this.radius)+"cm");
    }
    
    void diameter() { // Renamed for clarity, and fixed the calculation!
        System.out.println("Diameter of the Circle with radius " + this.radius + " = " + (2 * this.radius)+"cm");
    }
    
    void calculatecircumference() {
        System.out.println("Circumference of the Circle with radius " + this.radius + " = " + (2 * pi * this.radius)+"cm");
    }
}

public class Circletype{

    public static void main(String[] args) { 
        System.out.println("Circle App:");

        Circle c0 = new Circle();
        c0.calculateArea();
        c0.diameter();
        c0.calculatecircumference();

        Circle c1= new Circle();
        c1.calculateArea();
        c1.diameter();
        c1.calculatecircumference();

        Circle c2= new Circle();
        c2.calculateArea();
        c2.diameter();
        c2.calculatecircumference();

        int x[] = new int[5]; 

        Circle c[] = new Circle[3]; //Circle objects array Definition

        System.out.println(c[0]);   //null object
        System.out.println(c[0].radius); // 1.
        System.out.println("java.lang.NullPointerException");
    } 
}

/*Executing this line will however result in a exception none in the runtime at the runtime interpreter. 
That exception being 'java.lang.NullPointerException' */