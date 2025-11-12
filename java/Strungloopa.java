import java.util.Arrays;
public class Strungloopa {
    public static void main(String[]args)
    {
        String[] names ={"Balaji", "Survase", "Nirgun", "Inchekar", "Mayur", "Sonje"};
        System.out.println(Arrays.toString(names));

        String[] str1 = new String[4]; 
        str1[0] = "haha";
        str1[1] = "hoho";
        str1[2] = "hehe";
        str1[3] = "hejhej";

        for (int i = 0; i<str1.length; i++)
        {
            System.out.println("New String array is:" +str1[i]);
        }

    }
}
