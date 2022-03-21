import java.util.Scanner;

public class example23 {
    public static void main(String[] args) {
        int x,y,z;
        int avg;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value:");


        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        avg=average((int) x, (int) y, (int) z);
        System.out.println("The average is:" +avg);

    }
    public static int average(int num1,int num2,int num3)
    {
        int avg = (num1 + num2 + num3)/3;
        return avg;
    }
}






