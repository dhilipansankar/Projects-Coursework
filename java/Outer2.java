//type 2: Static Nested classes 

class Outer2 
{
    private static void outerMethod()
    {
        System.out.println("Inside outerMethod");
    }

    // Class 2 Static Inner class 
    static class Inner2
    {
        public static void display()
        {
            System.out.println("Inside Inner Class Method");
            outerMethod();
        }
    }
}


//Main class 
class StaticNestedClassDemo
{
    //Main Driver method 
    public static void main(String args[])
    {
        //Calling method static display method rather than an instance of an class.
        Outer2.Inner2.display();
    }
}


//A static class defined inside another class. It can't access non-static memebers of the outer class directly.