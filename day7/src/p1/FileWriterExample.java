

package p1;
        import java.io.FileWriter;
public class FileWriterExample {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\Amala\\ddddata.txt");
            fw.write("Well come to all. This is my first file handling program");
            fw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("File write Success...");
    }
}

