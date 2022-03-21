import java.util.Scanner;
public class Main53 {
    String modelword;
    String modelName;

    public  Main53(String n, String name) {
        modelword = n;
        modelName = name;
    }

    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Name : ");

            String input1 = sc.nextLine();
            System.out.print("Enter Second Name : ");
            String input2 = sc.nextLine();

            // divide two numbers
            System.out.println("login =" +input1+input2   );
            Main53 obj = new Main53("Hi", " Enter person ");
             System.out.println(obj.modelword + " " + obj.modelName+input1+input2);
        }
        catch(Exception e)
        {
            System.out.println("somthing unknown reasons");
        }
        finally{
            System.out.println(" always execute");
        }
    }
}