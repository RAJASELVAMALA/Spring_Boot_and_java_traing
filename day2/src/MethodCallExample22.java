public class MethodCallExample22{

    public static boolean check(int num1, int num2) {
        return (num1 / num2 == 0);
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 2;
        //System.out.println(num1==num2);
        if (check(num1, num2) == true)
            System.out.print("given  number zero");
        else
            System.out.print("not a given Number zero");
    }
}
