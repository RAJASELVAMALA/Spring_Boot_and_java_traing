import java.util.Scanner;

public class Main51 {

    public static void main(String[] args)
    {
        // reading input from us
        try{
            String value="";
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Number : ");

            int input1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int input2 = sc.nextInt();

            // divide two numbers
            System.out.println("output =" +input1/input2 + "Scanner example to divided of two numbers  " );
            System.out.println(value.length());
            int a = Integer.parseInt(null);

        }
        catch(Exception e)
        {
            System.out.println("somthing unknown reasons");
        }
    }
}
