import java.util.Scanner;
public class Main24 {
    String modelword;
    String modelName;
     int id;
    String Name ;

    public  Main24(String n, String name) {
        modelword = n;
        modelName = name;
    }

    public static void main(String[] args) {
        String name;
        int id;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");

        int input1 = sc.nextInt();

        System.out.println("Entered id is " + input1);

        String input2 = " ";
        System.out.print("Enter  Name : " + input2);
        input2 = sc.next();

        // divide two numbers
        System.out.println("login =" + input1 +"  " +input2);
        Main24 obj = new Main24("Hi", " Enter person ");
        System.out.println(obj.modelword + " " + obj.modelName +" ID:"+ input1 +" "+"Name:" + input2);

    }
}
