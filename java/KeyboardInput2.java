import java.util.Scanner;
public class KeyboardInput2
{
    public static void main(String[] args)
    {
        //Scanner Defenition
        Scanner scn = new Scanner(System.in);

        // Input a string(One word)
        System.out.println("Enter A Word:");
        String str1 = scn.nextLine();
        System.out.println("Entered String str1 is:" +str1);

        System.out.println("Enter A Sentence:");
        String str2 = scn.nextLine();
        System.out.println("Entered String str2 is:" +str2);


        System.out.println("Enter an Integer:");
        int x = Integer.parseInt(scn.nextLine());
        System.out.println("Entered Integer is:" +x);

        System.out.println("Enter A Float value:");
        float y = Float.parseFloat(scn.nextLine());
        System.out.println("Entered Integer is:" +y);
        scn.close();



    }
}