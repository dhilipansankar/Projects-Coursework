// Type 1: Nested Inner Class
public class Outerclass
{
    private int outerVar = 100;
//Inner class
    class  InnerClass
    {
        void display()
        {
            System.out.println("Hello From Inner Class");
            System.out.println("Outer Class Variable:" +outerVar);
        }
    }

    public static void main(String[] args)
    {
        Outerclass outer = new Outerclass();

        Outerclass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }

}
