import java.io.*;
public class FileInputOutput { //reading content from a tile and then writting it to a target file
    public static void main(
        String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {

            sourceStream
                 = new FileInputStream("sorcefile.txt");

            targetStream
                = new FileOutputStream("targetfile.txt");

            // Reading source file and writing content to target file byte by byte

            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);

        }
        catch (FileNotFoundException e1){System.out.println("Error = "+e1);}
        finally {

            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }

        System.out.println("END111");

    }
}