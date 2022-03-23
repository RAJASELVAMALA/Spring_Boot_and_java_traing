package p1;

import java.io.File;
        import java.io.IOException;
public class CreateFileExample1
{
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Amala\\newdata.txt"); //initialize File object and passing path as argument
       // boolean result;
        try
        {
           // result = file.createNewFile();  //creates a new file
           if( file.createNewFile())

            //  if(result)      // test if successfully created a new file

            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
           }
        }
        catch (IOException e)
        {
           // e.printStackTrace();    //prints exception if any
            System.out.println("Something error in file creating");
        }
    }
}
