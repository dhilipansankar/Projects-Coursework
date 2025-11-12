import java.io.*;
public class FileReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;

        try {
            sourceStream = new FileReader("/home/audoli/Documents/Programs/Java Demos/test.txt");    // Insert File Path here 

            //Reading sourcefile amd writing target file character by character 
            int temp; 
            while ((temp = sourceStream.read())!= -1 )
                System.out.println((char)temp);

        }
        finally{
            
            //Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}