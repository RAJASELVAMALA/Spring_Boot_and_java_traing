import java.io.*;

public class Example52 {

    public static void main(String args[]) {
        int a[]={10,20,200};
        try {
            //a[1] =20;
            System.out.println("Access element  :" + a[1]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexException thrown  :" );
        }
        System.out.println(" Out of the block ");
    }
}