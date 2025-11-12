import java.util.Scanner;

public class Mukbala
{
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);

        //
        System.out.print("Enter a word ");
        String str1 = scn.nextLine();
        System.out.println("Entered String str1:" +str1);
        
        //
        scn.nextLine();

        //
        System.out.println("Enter a sentence: ");
        String str2 = scn.nextLine();
        System.out.println("Entered String Str2: " +str2);

        //
        scn.nextLine();

        //
        System.out.print("Enter Integer");
        int x = 0;
        try
        {
            x = Integer.parseInt(scn.nextLine());
            System.out.println("Entered integer" + x);
        }
        catch (NumberFormatException e )
        {
            System.out.println("Invalid Integer input.");
        }

        //
        scn.nextLine();


        //
        System.out.print("Enter a float value: ");
        float f = 0.0f;
        try
        {
            f = Float.parseFloat(scn.nextLine());
            System.out.println("Entered float value: " + f);
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid float input");
        }

        scn.close();
    }
}
